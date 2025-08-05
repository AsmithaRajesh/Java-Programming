DEEFINE:
while (boolean_expression)
{
 // loop block
}
SYNTAX:
while (boolean_expression)
{
 // loop block
}
EXAMPLE:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner data = new Scanner(System.in);
        System.out.println("enter the number");
        num = data.nextInt();
        while (num >= 50) ;
        {
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        
        
    } 
}
