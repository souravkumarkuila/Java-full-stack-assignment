import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Test{
        int value();
    }

    //Applying annotation
    class hello {
        @Test(value=10)
        public void displayMethod(){System.out.println("testing annotation");}
    }

    //Accessing annotation
    public class annotation1{
        public static void main(String[] args)throws Exception{

            hello h = new hello();
            Method m=h.getClass().getMethod("displayMethod");

            Test manno=m.getAnnotation(Test.class);
            System.out.println("value is: "+manno.value());
        }
    }

