IF ELSE:

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
class Main{
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=data.nextInt();
        System.out.println("number:"+number);
        if (number%2==0){
            System.out.println("The Number is EVEN");
            
        }
        else;{
            System.out.println("The Number is ODD");
        }
        }
        
    }
    
