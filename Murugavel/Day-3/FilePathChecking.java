import java.io.File;
import java.util.Scanner;

public class FilePathChecking {
    public static boolean checkForFileExistence(String filePath) {
        File file = new File(filePath);
        if (file.isFile()) {
            return true;
        } else {
            if (file.isDirectory()) {
                File[] fileList = file.listFiles();
                if (fileList == null) {
                    return false;
                }

                for(File entry : fileList) {
                    if (entry.isFile()) {
                        return true;
                    }
                }
            }

            return false;
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

    }
}

