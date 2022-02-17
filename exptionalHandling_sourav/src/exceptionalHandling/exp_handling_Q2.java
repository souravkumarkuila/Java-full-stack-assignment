package exceptionalHandling;

import java.util.Scanner;

public class exp_handling_Q2 {

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
            throw new UnsupportedOperationException("Invalid operation for division");
        }

    }

}