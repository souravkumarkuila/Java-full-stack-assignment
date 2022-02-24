import java.util.ArrayList;
import java.util.Arrays;

public class lambdaassignment8 {
    public static void main(String[] args) {
        ArrayList <Integer> j = new ArrayList<>(Arrays.asList(6574 ,9326 ,5760 ,9112 ,6401 ,7189, 2169, 9886 ,9392, 8217));
        new Thread(() -> System.out.println(j)).start();  //lambda expression for new thread.
    }
}