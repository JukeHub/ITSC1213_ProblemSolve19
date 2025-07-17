import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleTest {
    private int expectedArea;

    public int getRectangleArea(int width, int height) {
       return expectedArea = width * height;
}
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
    }

}