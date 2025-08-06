import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[6];

        System.out.println("Enter the names:");
        for (int i = 0; i < 6; i++) names[i] = sc.nextLine();

        System.out.print("Name to be deleted: ");
        String del = sc.nextLine();
        for (int i = 0; i < 6; i++)
            if (names[i].equalsIgnoreCase(del)) 

        System.out.print("Name to be renamed: ");
        String oldName = sc.nextLine();
        System.out.print("New name for rename: ");
        String newName = sc.nextLine();
        for (int i = 0; i < 6; i++)
            if (names[i] != null && names[i].equalsIgnoreCase(oldName)) names[i] = newName;

        System.out.println("Updated names:");
        for (String name : names)
            if (name != null) System.out.println(name);
    }
}
