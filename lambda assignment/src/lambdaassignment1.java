

public class lambdaassignment1 {
    public static double addition(int num1, int num2) {
        return (num1+num2);
    }
    public static double subtraction(int num1, int num2){
        return (num1-num2);
    }
    public static double multiplication(int num1,int num2){
        return (num1*num2);
    }
    public static double division(int num1, int num2){
        return (num1/num2);
    }
    public static void main(String[] args) {
        int a = 9 ;
        int b = 8;
        calc cAdd  = () -> {
            System.out.println("Results of :");
            System.out.println("addition is :"+ addition(a,b));
            System.out.println("subtraction is :"+ subtraction(a,b));
            System.out.println("Multiplication is :"+ multiplication(a,b));
            System.out.println("division is :"+ division(a,b));
        };
        cAdd.doCalc();
    }


}

