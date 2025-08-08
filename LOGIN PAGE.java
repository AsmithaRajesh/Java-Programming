import java.util.Scanner;
public class Main {
    private static final String USERNAME = "Snapuser";
    private static final String PASSWORD = "snap@123";
    public static boolean snapChatLogin(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the  username:");
        String username = data.nextLine();
        System.out.println("Enter the  password:");
        String password = data.nextLine();
        if (snapChatLogin(username, password)) {
            System.out.println("Snapchat login successful.");
        } else {
            System.out.println("Snapchat login failed.");
        }
        data.close();
    }
}
