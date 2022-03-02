import java.util.ListIterator;
import java.io.*;
import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args)
    {
        ArrayList<Integer> List = new ArrayList<Integer>();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        ListIterator<Integer> List_Iterator
                = List.listIterator(List.size());

        System.out.println("Reversed : ");

        while (List_Iterator.hasPrevious()) {
            System.out.println(List_Iterator.previous());
        }
    }
}