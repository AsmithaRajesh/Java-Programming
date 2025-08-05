import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String firstname = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastname = scanner.nextLine();

        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();

        System.out.print("Enter your birth year: ");
        short yearOfBirth = scanner.nextShort();

        System.out.print("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();

        System.out.print("Enter your height in cm: ");
        float height = scanner.nextFloat();

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextFloat();

        System.out.print("Are you female? (True/False): ");
        boolean female= scanner.nextBoolean();
        
        System.out.print("Enter your blood group  (A, B, O, etc.): ");
        char bloodGroup = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println("\n--- Data ---");
        System.out.println("firstName: " + firstname);
        System.out.println("lastName: " + lastname);
        System.out.println("Age: " + age);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Height: " + height + " cm");
        System.out.println("weight: " + weight + " kg");
        System.out.println("female: " + female);
        System.out.println("Blood Group : " + bloodGroup);
        scanner.close();
    }
}
