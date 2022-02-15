import java.util.Objects;
import java.util.Scanner;

class Login {
    static String userId = "Ajay";
    static String password = "password";
    public static String loginUser(String user, String pass) {
        if (Objects.equals(user, userId) && Objects.equals(pass, password)) {
            return ("authenticated");
        } else {
            return ("not successful");
        }
    }
    public static void NewLogin(){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 3) {
            System.out.print("Enter the User Id");
            String user = sc.nextLine();
            System.out.print("Enter the password");
            String pass = sc.nextLine();
            String a = Login.loginUser(user, pass);
            if (Objects.equals(a, "authenticated")) {
                i = 4;
                System.out.print("hello " + user);
            }
            else if (Objects.equals(a, "not successful") && i > 2 ) {
                System.out.println("You have entered wrong credentials 3 times");
                System.out.println(" contact Admin");
                i++;
            }
            else {
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
                i++;
            }

        }
    }
}
public class AssignmentQ6 {
    public static void main(String[] args) {
        Login.NewLogin();
    }
}
