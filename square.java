import java.util.Scanner;

public class square {

        public static void main(String[] args) {

        // Ask for the side
        int side, area;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the length of the side");
        side = read.nextInt();

        // Calculate the area of a rectangle
        area = (int) Math.pow(side,2);

        // Print variables the result
        System.out.println("The area of the square is: " + area);
  }
}
