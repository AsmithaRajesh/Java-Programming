SYNTAX:
modifier returntyp name (){
  //method body
}

#EXAMPLE: 
class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Main obj = new Main(); 
        obj.sample();        
    }
    public void sample() {    
        int a = 10;
        System.out.println(a); 
    }
}

#Example:
class Main {
    public static void main(String[] args) {
        SubClass1 obj1 = new SubClass1();
        SubClass2 obj2 = new SubClass2();
        obj1.add(27, 8);
        obj2.subtract(50, 20 );
    }
}
class SubClass1 {
    public void add(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }
}
class SubClass2 {
    public void subtract(int x, int y) {
        System.out.println("Difference: " + (x - y));
    }
}
