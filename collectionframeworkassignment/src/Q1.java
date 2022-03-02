import java.util.*;
class Person
{
    int h,w;
    String name;
    public Person(int h, int w, String name) {
        this.h=h;
        this.w=w;
        this.name=name;
    }
    public int geth() {
        return h;
    }
    public int getw() {
        return w;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person [height=" + h + ", weight=" + w + ", name=" + name + "]";
    }

}
class hComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        return p1.geth()-p2.geth();
    }
}
class wComparator implements Comparator<Person>{
    public int compare(Person p1, Person p2){
        return p1.getw()-p2.getw();
    }
}
class NameComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
public class Q1 {

    public static void main(String[] args) {
        System.out.println("Select an Action");
        System.out.println("a) Height\nb) Name\nc) Weight\n");

        Scanner sc=new Scanner(System.in);
        String select=sc.nextLine();

        if(select.equals("a"))
        {
            TreeSet<Person> per=new TreeSet<>(new hComparator());
            per.add(new Person(170, 40, "Kuila"));
            per.add(new Person(90, 30 ,"Simran"));
            per.add(new Person(185, 80, "Krishna"));
            per.add(new Person(175, 60, "Hari"));
            for (Person pers : per) {
                System.out.println(pers.toString());
            }
        }
        else if(select.equals("b"))
        {
            TreeSet<Person> per=new TreeSet<>(new wComparator());
            per.add(new Person(180, 120, "Kuila"));
            per.add(new Person(176, 75 ,"Simran"));
            per.add(new Person(182, 80, "Krishna"));
            per.add(new Person(184, 50, "Hari"));
            for (Person pers : per) {
                System.out.println(pers.toString());
            }
        }
        else if(select.equals("c"))
        {
            TreeSet<Person> per=new TreeSet<>(new NameComparator());
            per.add(new Person(180, 120, "Kuila"));
            per.add(new Person(176, 75 ,"Simran"));
            per.add(new Person(182, 80, "Krishna"));
            per.add(new Person(184, 50, "Hari"));
            for (Person pers : per) {
                System.out.println(pers.toString());
            }
        }


    }

}
