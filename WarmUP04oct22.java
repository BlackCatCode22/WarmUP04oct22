import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WarmUP04oct22 {

    // Instructions:
    // 1) Discuss this code with your lab partner
    // 2) Code up this warmup and examine the output
    // 3) Create the genBirthDay() function you are designing
    //
    // References:
    //   https://www.w3schools.com/java/java_files_read.asp
    //   https://www.w3schools.com/java/java_arrays.asp
    //   https://www.geeksforgeeks.org/searching-for-characters-and-substring-in-a-string-in-java/
    //   https://www.w3schools.com/java/java_methods.asp





    static String genBirthDay(String ageData, String seasonData ) {
        String retVal = "";
        if (seasonData.startsWith("born in spring")){
            retVal = "March 1";
        }
        return retVal;
    }




    public static void main(String[] args) {


        // Open a file and read it line by line.
        int lineCount = 0;
        try {
            File file = new File("C:/javaMidTermFiles/arrivingAnimals.txt");
            Scanner scanner = new Scanner(file);
            lineCount = 1;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
                lineCount++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Get the lines into a 1D array.
        // Create an array. Note the initialized array size.
        String[] linesInAnimalNameFile = new String[lineCount];
        int elementNum = 0;

        try {
            File file = new File("C:/javaMidTermFiles/arrivingAnimals.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String fileLineAsString = scanner.nextLine();
                // Write string data to the array.
                linesInAnimalNameFile[elementNum] = fileLineAsString;
                elementNum++;
            }
            // Close the file.
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Display the array of file lines.
        System.out.println("\n The array looks like this..\n");
        for (int i=0; i<lineCount; i++){
            System.out.println(linesInAnimalNameFile[i]);
        }

        // Parse the array!
        String aLine = "";
        aLine = linesInAnimalNameFile[2];
        System.out.println("\n aLine = " + aLine);

        // Parse this string...
        // TODO: why are you naming these variables like this?
        String animalAgeData = "";
        String animalBirthData = "";

        // Split the sting into six data elements.
        // split receives a regex pattern and a limit
        // 0 will parse the string until the end!
        String[] animalInputData = aLine.split(",",0);
        System.out.println("\n\n");
        for (String items:animalInputData) {
            System.out.println(items);
        }
        System.out.println("\n\n");

        // Use the first two elements in this array for your genBirthDay() method!

        String birthday = genBirthDay("4 year old male hyena", "born in spring" );

        System.out.println("\n\n birthday is: " + birthday + "\n\n");

    }
}
