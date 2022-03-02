import java.util.ArrayList;

public class javaassignment3 {
        public static void main(String[] args) {


            ArrayList<String> al = new ArrayList<String>();
            al.add("A quick brown fox jumps over the lazy dog.");
            String[]arr=al.toArray(new String[al.size()]);
            for(String j:arr){
                System.out.println(j);
            }
        }
    }

