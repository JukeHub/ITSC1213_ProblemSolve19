import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RectangleFromFile {
    public static void main(String[] args) {
        File file = new File("rectangles.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
            
            try {
                String[] parts = line.split(" ");
                int width = Integer.parseInt(parts[0]);
                int height = Integer.parseInt(parts[1]);

                Rectangle r = new Rectangle(0, 0, width, height);
                System.out.println("Rectangle: " + r + ", Area: " + (width * height));
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Skipping invalid line: \"" + line + "\"");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: Skipping invalid line: \"" + line + "\"");
        }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: rectangles.txt");
        }
    }
}
