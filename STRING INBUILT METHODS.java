import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String str = data.nextLine();
        #charAt()
        char ch = str.charAt(0);
        System.out.println("The Character is: " + ch);
        #codePointBefore()
        char ch1 = (char) str.codePointBefore(3);
        System.out.println("The Character Before is: " + ch1);
        #codePointAt()
        char ch2 = (char) str.codePointAt(4);
        System.out.println("The Character After is: " + ch2);
        #codePointCount()
        int ch3 = str.codePointCount(0, 4);
        System.out.println("The number is: " + ch3);

    
    }
}
