import java.util.Scanner;
class SiCi {
    public static double simpleInterest(double principalAmount, int time, double interestRate){
        double si;
        si = principalAmount * time * interestRate/100 ;
        return si;
    }
    public static double compoundInterest(double principalAmount, int time, double interestRate){
        double ci = principalAmount * (Math.pow(1 + interestRate / 100, time));
        return ci ;
    }
}
public class AssignmentQ3 {
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter your principle amount");
        double p = sc.nextDouble();
        System.out.print("Please enter the time ");
        int t = sc.nextInt();
        System.out.print("Please enter the interest rate");
        double ir = sc.nextDouble();
        System.out.print("Please select your choice : 1 - simple interest , 2 : Compound interest");
        int q = sc.nextInt();
        if(q == 1 ){
            System.out.print(SiCi.simpleInterest(p,t,ir));
        }
        else if (q == 2) System.out.print(SiCi.compoundInterest(p, t, ir));
    }
}