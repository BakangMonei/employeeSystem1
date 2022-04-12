import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    public static String fileScanner()
    {
        String fileData = "";
        File file = new File("employee.txt");

        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                fileData += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileData;
    }

    public static String[] textDataLines()
    {
        String[] fileData = fileScanner().split(";");

        return fileData;
    }

    public static void main(String[] args) {
        System.out.println(textDataLines()[1]);
    }
}
