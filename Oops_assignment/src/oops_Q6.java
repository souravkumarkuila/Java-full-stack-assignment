
    abstract class Persistence {
        abstract public String persist();
    }
    class FilePersistence extends Persistence{
        @Override
        public String persist() {
            return "File persistence";
        }
    }
    class DatabasePersistence extends Persistence{
        @Override
        public String persist() {
            return "Data persistence";
        }
    }

    public class oops_Q6 {
        public static void main(String[] args) {

            //Persistence percistence = new Persistence();

        }

    }

