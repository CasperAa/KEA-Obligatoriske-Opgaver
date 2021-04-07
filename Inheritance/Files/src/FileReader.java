import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {

        File FileType = new File("Location/FileName.csv");
        //A Scanner, asking the user which symbol is used in file to separate the words
        Scanner separatedSign = new Scanner(System.in);
        String userSign = separatedSign.nextLine();
        System.out.println("What symbol separates the words in your file? ");

        //Using the Scanner class to read the file and to ask the user for input
        Scanner readFile = new Scanner(FileType);

        //Creating an ArrayList to store the data from the file
        ArrayList<RowData> fileData = new ArrayList<RowData>();

        //Using a while loop guarantee all rows in the file is read
        while (readFile.hasNext()) {

            String currentRow = readFile.nextLine();

            //Using the split method to divide a rows data, and storing it in a list
            String[] lineAsArray = currentRow.split(userSign);

            //Storing the lists data in two different Strings using their index location
            String columnA = lineAsArray[0];

            //Creating a instance of data from each row with the String data from above
            RowData newDataRow = new RowData(columnA);

            //Adding the student to the ArrayList
            fileData.add(newDataRow);

        }
        //Prints a short message and the size of the ArrayList (amount of words in the file)
        System.out.println("Your file has been scanned, the file consists of: " + fileData.size() + "words");

    }
}
