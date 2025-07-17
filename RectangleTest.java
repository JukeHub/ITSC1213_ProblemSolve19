import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        // new code
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();

        // old code
        // Rectangle box1 = new Rectangle(10, 10, 40, 30);
        Rectangle box1 = new Rectangle(10, 10, width, height);
        System.out.println("box1: " + box1);

        double area = box1.getWidth() * box1.getHeight();
        double expectedArea = width * height;

         if (area == expectedArea) {
                System.out.println("++++ Test passed: Area is correct.");
            } else {
                System.out.println("---- Test failed: Expected " + expectedArea + " but got " + area);
            }
    }
}