abstract class name {
    String name;
    name(String name){
        this.name =name;
    }
    public  abstract String getname();
    //Point 1 : here the method declared is abstract so the class should be abstract ;
}
    class person extends name{
        person(String name) {
            super(name);
        }
        @Override
        public  String getname(){
            return ("Hello,"+this.name);
        }
    }

    //point -3 :
//here if the class AbstClassP3ex isn't Abstract or else the methods of abstract class aren't
// overridden we would get a compile time error.
    abstract class MyClass {
        public abstract void display();
    }

    class  AbstClassP3ex extends MyClass{
        @Override
        public void display(){
            System.out.println("This is the subclass implementation of the display method ");
        }
    }

    //point -4 :
//here the class Myclass2 is Abstract & private, so it can't be used until its made default .
    abstract class MyClass2 {
        public abstract void display2();
    }

    class AbstClassP4ex extends MyClass2{
        public void display2(){
            System.out.println("This is not the Private Class ");
        }
    }
    abstract class MyClass3 {
        public void display3(){
            System.out.println("this is an abstract class without abstract method");
        }
    }
// point - 5 :
// An abstract class can’t be final because the final and abstract are opposite terms in JAVA. the final class can't be extended.
// point - 6 :
//  we  can declare a class abstract without having any abstract method.
// the class MyClass3 has not abstract method but is a abstract class .


    class AbstClassP6ex extends MyClass3{
    }


    public class Oops_Q4 {
        public static void main(String[] args) {
            person user1 = new person("Sourav");
            System.out.println(user1.getname());
            // point 2 : Abstract class cannot be instantiated.
            //name point2 = new name("this is abstract");
            //trying to instantiate the above Abstract class name will lead to the errors ,
            // it wouldn't instantiate the Abstract class because it is not complete , therefore it can't be used.
            new AbstClassP3ex().display();
            new AbstClassP4ex().display2();
            new AbstClassP6ex().display3();

        }
    }

