import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A Project to read a file with a maximum of 3 attempts before diplaying error message
 *
 * @author thangaakilanv
 */

public class RetryReadingFiles {
    public static void main(String[] args) {
        byte maxRetry = 3, retryCount = 0;

        File file = new File("readme.txt");

        while(retryCount < maxRetry){
            try(Scanner scanner = new Scanner(file);){
                while(scanner.hasNextInt()){
                    System.out.println(scanner.nextLine());
                }
            }catch(FileNotFoundException e){
                retryCount++;
                if(maxRetry > retryCount){
                    System.out.println("File not found, retrying....");
                }else{
                    System.out.printf("Failed to read the file after %d times\n",retryCount);
                    System.out.println(e);
                }
            }
        }

    }
}
