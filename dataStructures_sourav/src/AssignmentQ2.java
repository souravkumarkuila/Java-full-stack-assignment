import java.util.Scanner;

public class AssignmentQ2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number-");
        int min = sc.nextInt();
        System.out.print("Enter the number-");
        int max = sc.nextInt();
        ArmstrongNumBetweenRange.armstrongNumbersInRange(min,max);
    }
}
class ArmstrongNumBetweenRange{
    public static int[] armstrongNumbersInRange(int min, int max) {
        for (int i = min; i <= max;i++){
            if (ArmstrongOrNot.armstrongCheck(i)) {
                System.out.print(i+" ");
            }
        }
        return null;
    }
}

