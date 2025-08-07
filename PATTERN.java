NUMBER PATTERN:
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int rows = 8;

        for (int i = 1; i <=rows; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print( j + " ");
            }
            System.out.println(); 
        }
    }
}

REVERSE PATTERN:
public class Main {
    public static void main(String[] args) {
        int n = 8;

        for (int i = n; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
