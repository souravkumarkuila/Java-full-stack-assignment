import java.util.Scanner;
public class AssignmentQ5{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter Your Ctc");
        double ctc = sc.nextDouble();
        System.out.print("your income tax is :"+TaxAmount.calculateTaxAmount(ctc));
    }
}
class TaxAmount{
    public static double calculateTaxAmount(double ctc){
        double tax = 0;
        if(ctc<=80000){
            tax = 0;
        }
        else if(ctc>=181001 && ctc<=300000){
            tax = (ctc/100)*10;
        }
        else if(ctc>=300001 && ctc<=500000){
            tax = (ctc/100)*20;
        }
        else if(ctc>=500001&& ctc<=1000000){
            tax = (ctc/100)*30;
        }
        return tax;
    }
}
