import java.util.Scanner;
public class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = data.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = data.nextInt();
        System.out.print("Enter operation: ");
        char op = data.next().charAt(0);
        int result = 0;
        switch (op) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        System.out.println("Result: " + result);
    }
}
