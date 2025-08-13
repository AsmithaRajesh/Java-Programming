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


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String data = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String hi = "hi %s my age %d";
        System.out.println(data.equalsIgnoreCase("jayasri"));
        System.out.printf(hi, data, age);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String data = "hello";
        String hi = "hi %s my age %d";
        System.out.println(data.equalsIgnoreCase("hello"));
        System.out.printf(hi, "hello", 20);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char[] data = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(data);
        String myString = "helloworld";
        myString.getChars(7,10,data,4);
        System.out.println(data);
    }
}

public class Main {
    public static void main(String[] args) {
        char[] data={'9','1','8','0'};
        System.out.print(data);
        String mystring="Asmitha";
        mystring.getChars(7,7,data,0);
        System.out.print(mystring);
 }
}

public class Main {
    public static void main(String[] args) {
        String name="Asmitha";
        byte[] arr=name.getBytes();
        System.out.println(name.hashCode());
 }
}

public class Main {
    public static void main(String[] args) {
        String name="Asmitha";
        System.out.print(name.toUpperCase());
 }
}

public class Main {
    public static void main(String[] args) {
        String name="Asmitha maha";
        System.out.print(name.indexOf("maha"));
    }
}


public class Main {
    public static void main(String[] args) {
        String name="Hello World";
        String names="";
        System.out.println(name.isEmpty());
        System.out.println(names.isEmpty());
    }
}

public class Main {
    public static void main(String[] args) {
        String a="Hello Asmitha";
        String b="World Maha";
        String x = "Asmitha|Maha|java";
        System.out.println("Asmitha".matches(x));
        System.out.println("Maha".matches(x));
        System.out.println("Java".matches(x));
        System.out.println(a.regionMatches(7,a,4,5));
    }
}

public class Main {
    public static void main(String[] args) {
        String a="Hello";
        String b="Hello Asmitha Hello";
        System.out.println(a.replace('l','p'));
        String x="(?i)Hello";
        System.out.println(b.replaceAll(x,"Hi"));
        String y="Hello";
        System.out.println(b.replaceFirst(y,"Hi"));
    }
}


public class Main {
    public static void main(String[] args) {
        String x="Hello World";
        String y="[,\\.\\s]";
        String[] z=x.split(y);
        for(String  s:z){
        System.out.print(s);
    }
}
}

import java.util.Scanner;  
class Main {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = data.nextLine();
        String y = "[\\.\\s]";  
        String[] z = x.split(y);
        String concatenated = "";
        System.out.println("Split parts:");
        for (String s : z) {
            System.out.println(s);
            concatenated += s;
        }
        System.out.println("Concatenated string: " + concatenated);
    }
}


public class Main {
    public static void main(String[] args) {
        String a="Hello";
        System.out.println(a.startsWith("Hello"));
        System.out.println(a.startsWith("World"));
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String x = "hello world";
        char[] y = x.toCharArray();   
        System.out.println(y[8]);
        
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String x = scanner.nextLine();          
        char[] y = x.toCharArray();
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);               
        }
        
        scanner.close();  
    }
}
