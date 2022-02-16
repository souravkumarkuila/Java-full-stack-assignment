import java.util.Scanner;


    abstract class DesertItem {

        abstract public int getCost();
    }
    class Candy extends DesertItem {
        int TotalCandies=0;
        int DollarInRupee = 60;

        public int addCandies(int candies){
            TotalCandies+=candies;
            return  TotalCandies;

        }

        public int getCost() {
            return TotalCandies*DollarInRupee;
        }
    }
    class Cookie extends DesertItem {
        int TotalCookies=0;
        int EuroInRupee =70;
        public int addCookies(int cookies){
            TotalCookies+=cookies;
            return  TotalCookies;

        }

        public int getCost() {
            return TotalCookies*EuroInRupee;
        }
    }
    class IceCream extends DesertItem {
        int totalIceCream=0;
        public int addIceCreams(int iceCreams){
            totalIceCream +=iceCreams;
            return totalIceCream;
        }

        public int getCost() {
            return 0;
        }
    }


    public class oops_Q7 {


        public static void main(String[] args) {

            oops_Q7 assignment2Q7 = new oops_Q7();
            assignment2Q7.selectRoles();
        }
        private void selectRoles(){
            System.out.println("Enter your role  customer or owner");

            String role;
            Scanner sc = new Scanner(System.in);
            role = sc.next();

            roles(role);
        }
        private void roles(String role){

            if(role.toUpperCase().equals("CUSTOMER")){
                placeOrder();
            }
            else if(role.toUpperCase().equals("OWNER"))
                addItems();
            else
                System.out.println("Please enter valid details!");
        }
        private void addItems() {

            System.out.println("Choose itmes to be added :");
            System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
            System.out.println("Enter your choice: ");
            int ch;
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            addItemsOperation(ch);
        }
        private void addItemsOperation(int choice) {
            Scanner sc = new Scanner(System.in);
            switch (choice) {
                case 1:
                    Candy candy = new Candy();
                    System.out.println("Enter the amount of candies to be added: ");
                    int amount;
                    amount = sc.nextInt();
                    int total = candy.addCandies(amount);
                    System.out.println("Candies added succesfully and totaly availabe are: " + total);
                    break;
                case 2:
                    Cookie cookie = new Cookie();
                    System.out.println("Enter the amount of cookies to be added: ");
                    //int amount;
                    amount = sc.nextInt();
                    total = cookie.addCookies(amount);
                    System.out.println("Cookies added succesfully and total availabe are: " + total);
                    break;
                case 3:
                    IceCream iceCream = new IceCream();
                    System.out.println("Enter the amount of Ice Cream to be added: ");
                    //int amount;
                    amount = sc.nextInt();
                    total = iceCream.addIceCreams(amount);
                    System.out.println("Ice Creams added succesfully and total availabe are: " + total);
                default:
                    System.out.println("please enter valid number!");
                    break;
            }
        }


        private void placeOrder() {
            System.out.println("Choose itmes to be placed :");
            System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
            System.out.println("Enter your choice: ");
            int ch;
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            placeOrderOperation(ch);

        }
        private void placeOrderOperation(int choice) {

            switch (choice) {
                case 1:
                    Candy candy = new Candy();
                    System.out.println("Enter the amount of candies to be placed ");

                    int total = candy.getCost();
                    System.out.println("Candies placed succesfully and total cost is " + total);
                    break;
                case 2:
                    Cookie cookie = new Cookie();
                    System.out.println("Enter the amount of cookies to be placed ");//int amount;

                    total = cookie.getCost();
                    System.out.println("Cookies placed succesfully and total  cost is " + total);
                    break;
                case 3:
                    IceCream iceCream = new IceCream();
                    System.out.println("Enter the amount of Ice Cream to be added ");

                    total = iceCream.getCost();
                    System.out.println("Ice Creams placed succesfully and total cost is : " + total);
                default:
                    System.out.println("please enter valid number!");
                    break;
            }
        }
    }

