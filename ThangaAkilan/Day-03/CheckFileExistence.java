import java.io.File;
import java.util.Scanner;

/**
 * Check whether file exists at a specified location and display the information
 *
 * @author thangaakilanv
 */
public class CheckFileExistence {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the File name with it's path : ");
    String location = scanner.nextLine();

    // Sample path for example : /Users/thangaakilanv/Documents/internship/ACE-25-java-training/ThangaAkilan

    // File class for file and directory object
    File fileDirectory = new File(location);
    System.out.println((fileDirectory.exists())?"The file Exists":"No the file does not exist");
    scanner.close();
    }
}
