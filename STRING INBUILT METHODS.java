import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter Name1:");
        String str = data.nextLine();
        System.out.println("Enter Name2:");
        String str1=data.nextLine();
        
        char ch = str.charAt(0);
        System.out.println("The Character is: " + ch);
       
        char ch1 = (char) str.codePointBefore(3);
        System.out.println("The Character Before is: " + ch1);
      
        char ch2 = (char) str.codePointAt(4);
        System.out.println("The Character After is: " + ch2);
      
        int ch3 = str.codePointCount(0, 4);
        System.out.println("The number is: " + ch3);
        
        int ch4=str.compareTo(str1);
        System.out.println("Result:"+ch4);
        
       
        
        

    
    }
}
