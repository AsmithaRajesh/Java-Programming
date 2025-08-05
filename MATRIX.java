DEFINE:(WORKING FLOW)
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
public class main {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer loop i = " + i);
        for (int j = 1; j <= 3; j++) {
                System.out.println(i*j);
            }
        }
    }
}
