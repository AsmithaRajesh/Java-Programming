DEFINE:(WORKING FLOW)
1. The initial condition statement (the first portion in parentheses) is executed.
2. The boolean expression (the second portion in parentheses) is tested to see if it is
true. If so, the body of the loop is executed, if it is false, the for loop is exited.
3. The iteration statement (the third portion in the parentheses) is executed. It
returns to Step 2 and continues until the loop is exited.
SYNTAX:
for (initial_condition; boolean_expression; iteration)
{
 // loop block
}
EXAMPLE:
import java.util.Scanner;
public class count{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        
        for (int count = 10; count>=1; count--)
        {
          System.out.println(count);
        }
    }
}    
