import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

    public class lambdaassignment3 {

        public static void main(String[] args) {
            //Consumer interface
            Consumer <Integer> c1 = (input) -> System.out.println(input);
            c1.accept(3);
            Consumer <String> c2 = (input) -> System.out.println(input+" consumer implementation");
            Consumer <String> c3 = (input) -> System.out.println(input+"3rd consumer method");
            c2.andThen(c3).accept("This is");

            // Supplier with consumer :
            Supplier<LocalDate> s = () ->  LocalDate.now();
            Consumer<LocalDate> c = (t) -> System.out.println(t);
            c.accept(s.get());

            // Function
            Function<String ,Integer> f = (input) -> input.length();
            c1.accept(f.apply("Sourav"));

            // Predicate
            Consumer<Boolean> c4 = (t) -> System.out.println(t);
            Predicate<Integer> p = (i) -> {if(i%2 == 0){return true;} else {return false;}};
            c4.accept(p.test(f.apply("Sourav")));
        }

    }

