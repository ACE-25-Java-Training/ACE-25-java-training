import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

/**
 * The FilePathChecking class provides method to check for the presence of any file inside the specified file path.
 * @author Murugavel
 */
public class FilePathChecking {

    /**
     * Checks for the presence of file inside a file path passed as an argument.
     * Uses FileFilter Interface to filter out only the files if the file path is a directory.
     * Returns a boolean true if a file is found, else returns boolean false.
     * @param filePath
     * @return boolean
     */
    public static boolean checkForFileExistence(String filePath) {
        File file = new File(filePath);
        if (file.isFile()) {
            return true; // if the path mentioned itself is a file
        } else {
            FileFilter filter = new FileFilter() { // implementing the FileFilter interface
                @Override
                public boolean accept(File pathname) {
                    return pathname.isFile();
                }
            };
            File[] fileList = file.listFiles(filter); // filters only the files inside the directory
            // checks if the path is a valid one and it contains at least a file
            return fileList != null && fileList.length > 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();
        boolean doesExist = checkForFileExistence(filePath);
        if (doesExist) {
            System.out.println("File exists in the specified path");
        } else {
            System.out.println("No file exists in the path");
        }
        sc.close();
    }
}

