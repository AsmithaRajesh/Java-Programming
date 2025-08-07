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

#PYRAMID PATTERN:
public class Main {
    public static void main(String[] args) {
        int n = 4;  

        for (int i = 1; i <= n; i++) {
            
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

#DIAMOND PATTERN:
public class Main {
    public static void main(String[] args) {
        int n = 5;

       
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

            
            if (i == n) {
                for (int s = 1; s <= n - i; s++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

#PARALLEL PATTERN:
public class DoublePyramid {
    public static void main(String[] args) {
        int n=3; 
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++) 
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) 
            {
                System.out.print("A ");
            }

            for (int j=1;j<=(n-i)*2;j++) 
            {
                System.out.print(" ");
            }

            for (int k=1;k<=i;k++) 
            {
                System.out.print(" A");
            }
            System.out.println();
        }
    }
}
