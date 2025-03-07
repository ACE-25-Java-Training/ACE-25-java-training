import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

/**
 * The FileOpening class simulates throwing of exception from the main method and tries to open and print
 * the contents of a sample text file inside the catch block.
 * @author Murugavel
 */
public class FileOpening {
    private static Logger logger = Logger.getLogger(FileOpening.class.getName());
    public static void main(String[] args) {
        try {
            for(int count = 0; count < 3; ++count) {
                if (count == 0 || count == 1) {
                    throw new Exception("User thrown exception");
                }
            }
        } catch (Exception e) {
            try (
                    FileReader fr = new FileReader("./Murugavel/Day-3-FileHandling/sample.txt");
                    BufferedReader br = new BufferedReader(fr);
            ) {
                while(br.ready()){
                    System.out.println(br.readLine());
                }
            } catch (Exception exception) {
                logger.warning(exception.getMessage());
            }
        }

    }
}
