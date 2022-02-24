import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

class  convertToUpperCase implements UnaryOperator<String>
{
    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
}
public class lambdaassignment6
{
    public static void main(String[] args)  {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("Asad", "Bdsa", "Cdwe", "Derf", "Esada"));
        System.out.println("Before Converting  : "+a+"\n");
        a.replaceAll( new convertToUpperCase());
        System.out.println("After Converting  : "+a+"\n");

    }

}