#NUMBER PATTERN:
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

#REVERSE PATTERN:
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

#CONTINUOUS RANGE NUMBER PATTERN:
public class Main {
    public static void main(String[] args) {
        int num = 1;      
        int n = 6;
        for (int i = 1; i <= n; i++) {    
            for (int j = 1; j <= i; j++) { 
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
#SQUARE VALUES PATTERN:
public class Main {
    public static void main(String[] args) {
        int num = 1;      
        int n = 6;
        for (int i = 1; i <= n; i++) {        
            for (int j = 1; j <= i; j++) {    
                System.out.print((num * num) + "   ");
                num++;
            }
            System.out.println();
        }
    }
}

#REMAINDER VALUES PATTERN:
public class Main {
    public static void main(String[] args) {
        int num = 1;
        int n = 6;
        for (int i = 1; i <= n; i++) {        
            for (int j = 1; j <= i; j++) {    
                System.out.print((num % 2) + " ");  
                num++;
            }
            System.out.println();
        }
    }
}
