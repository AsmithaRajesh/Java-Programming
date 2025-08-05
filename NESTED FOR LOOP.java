DEFINE:
FOR LOOP INSIDE A FOR LOOP IS NESTED FOR
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
                System.out.println("Inner loop j = " + j);
            }
        }
    }
}
