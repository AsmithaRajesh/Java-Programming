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
        System.out.println("Comparison Result:"+ ch4);
        
        int ch5 = str.compareToIgnoreCase(str1);
        System.out.println("Result:"+ ch5);
        
        String ch6=str.concat(str1);
        System.out.println(ch6);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter any String1:");
        String str1 = x.nextLine();
      
        boolean my = str1.contains("Hello");
        System.out.println(my);
        
        boolean mystr = str1.contentEquals("Hello");
        System.out.println(mystr);
        
        
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text:");
        String input = sc.nextLine();
        char[] data = input.toCharArray();
        String str = String.copyValueOf(data);
        System.out.println("String from char array: " + str);
        char[] charArray = str.toCharArray();
        System.out.print("Char array from string: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        String str2 = String.copyValueOf(charArray);
        System.out.println("String again from char array: " + str2);

        sc.close();
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String data = "hello";
        String hi = "hi %s my age %d";
        System.out.println(data.equalsIgnoreCase("hello"));
        System.out.println(String.format(hi,"hello",20));

        
       
    }
}
