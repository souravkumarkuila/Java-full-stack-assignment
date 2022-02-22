import java.util.HashSet;
import java.util.Set;
    public class collectionQ2 {
        public static void main(String[] args) {
            Set<Integer> objects= new HashSet<>();
            objects.add(1);
            objects.add(2);
            objects.add(3);
            objects.add(4);
            objects.add(5);
            objects.add(6);
            objects.add(7);
            objects.add(8);
            objects.add(9);
            objects.add(10);
            System.out.println(objects);
            objects.add(7);
            System.out.println(objects);
        }
    }

