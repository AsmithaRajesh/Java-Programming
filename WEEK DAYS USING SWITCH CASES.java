DEFINE:
The switch statement allows a choice from a number of options. It will test a number of
cases against a variable of type char, byte, short, or int.
SYNTAX:
switch (variable)
{
 case value0:
 // block to execute
 break;
 case value1:
 // block to execute
 break;
 default:
 // block to execute
}
EXAMPLE:
import java.util.Scanner;
public class weeks{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int days = 4;
        switch(days)
        {
         case 0:
         System.out.println("Sunday");
         break;
         case 1:
         System.out.println("Monday");
         break;
         case 2:
         System.out.println("Tuesday");
         break;
         case 3:
         System.out.println("Wednesday");
         break;
         case 4:
         System.out.println("Thursday");
         break;
         case 5:
         System.out.println("Friday");
         break;
         case 6:
         System.out.println("Saturday");
         break;
         
        }
        }
    } 


