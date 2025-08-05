DEFINE:(WORKING FCLOW)
The following steps describe how the for loop works.
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
public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper limit for outer loop (i): ");
        int outerLimit = sc.nextInt();

        System.out.print("Enter the upper limit for inner loop (j): ");
        int innerLimit = sc.nextInt();

        for (int i = 1; i <= outerLimit; i++) {
            System.out.println("Outer loop i = " + i);
            for (int j = 1; j <= innerLimit; j++) {
                System.out.println(i * j);
            }
        }

        sc.close();
    }
}
