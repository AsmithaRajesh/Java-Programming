DEFINE:
Because the condition is checked first in a while loop, it is possible that the loop may
never execute. This second iteration type ensures that the loop block executes at least
once by placing the condition at the end of the loop.
SYNTAX:
do
{
 // loop block
} while (boolean_expression);
EXAMPLE:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner data = new Scanner(System.in);
        System.out.println("enter the number");
        num = data.nextInt();
        do
        {
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        while (num >= 50) ;
        
    } 
}

