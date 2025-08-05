SYNTAX:
if (boolean_expression1)
{
 // One or more lines of code.
}
else if (boolean_expression2) // OPTIONAL
{
 // Still more lines of code.
}
else // OPTIONAL
{
 // Yet more lines of code.
}
EXAMPLE:
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = Scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } 
        else {
            System.out.println(year + " is not a leap year.");
        }
        
       
    }
}
