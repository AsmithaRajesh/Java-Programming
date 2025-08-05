import java.util.Scanner;

public class count{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        for (int i = 10; i >= 0; i--) {
            if (i % 2 == 0) { 
                System.out.println(i);
            }
        }
    }
}    
