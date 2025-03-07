import java.io.BufferedReader;
import java.io.FileReader;

public class FileOpening {
    public FileOpening() {
    }

    public static void main(String[] args) {
        try {
            for(int count = 0; count < 3; ++count) {
                if (count == 0 || count == 1) {
                    throw new Exception("User thrown exception");
                }
            }
        } catch (Exception e) {
            try (
                    FileReader fr = new FileReader("./Murugavel/Day-3/sample.txt");
                    BufferedReader br = new BufferedReader(fr);
            ) {
                for(String lineContent = br.readLine(); lineContent != null; lineContent = br.readLine()) {
                    System.out.println(lineContent);
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }
}
