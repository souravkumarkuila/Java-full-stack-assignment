import java.util.Objects;

    class SingletonInheritanceCheck{
        public static void Check(Singleton x, Singleton y) {
            if(Objects.equals(x, y)){
                System.out.println("Singleton Inheritance check complete and authenticated");}

            else {
                System.out.println("this is not a singleton class");
            }
        }
    }
    class Singleton
    {
        private static Singleton instance;
        public String str;
        private Singleton()
        {
            str = "This is a singleton class";
        }
        public static Singleton getInstance()
        {
            if (instance == null)
            {
                instance = new Singleton();
            }
            return instance;
        }
        public static void main(String args[])
        {
            Singleton text = Singleton.getInstance();
            Singleton text2 = Singleton.getInstance();
            System.out.println(text.str);
            System.out.println(text2.str);
            SingletonInheritanceCheck.Check(text,text2);
        }
    }

