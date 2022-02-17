package exceptionalHandling;
import java.util.*;

    public class exp_handling_Q1 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            int a;
            a= sc.nextInt();
            int b;
            b= sc.nextInt();
            try {
                System.out.println(a / b); // throw Exception
            }
            catch (ArithmeticException e) {
                // Exception handler
                System.out.println(
                        "Divided by zero operation cannot possible");
            }

        }

    }

