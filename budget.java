/*
In a business there are three branches: branch1, branch2, branch3
The business's annual budget is distributed
40% branch1, 30% branch2, 30% branch3,
Read the total budget and print the budget value by branch
*/
       
import java.util.Scanner;

public class budget {

    public static void main(String[] args) {

        // Read the total budget
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the business's total annual budget: ");
        double budget = input.nextDouble(); //

        // Calculate the budget per area
        double branch1 = budget * 0.4d; 
        double branch2 = budget * 0.3d;
        double branch3 = budget * 0.3d;

        // Print the budget per area
        System.out.println("Budget for branch1: " + branch1);
        System.out.println("Budget for branch2: " + branch2);
        System.out.println("Budget for branch3: " + branch3);
    }
}

/* python

budget = float(input("Enter the business's total annual budget: "))

branch1 = budget * 0.4
branch2 = budget * 0.3
branch3 = budget * 0.3 

print("Budget for branch1: ", branch1)
print("Budget for branch2: ", branch2)
print("Budget for branch3: ", branch3)

*/
