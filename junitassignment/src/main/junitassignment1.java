package main;
public class junitassignment1 {
    public static double withdraw(double amount) throws  InsufficientBalanceException {
        double balance = 600 ;
        try {
            if(balance<amount){
                throw new InsufficientBalanceException ("insufficient balance in the account");
            }
            balance -= amount ;
            return balance;
        }
        catch (RuntimeException re){
            System.out.println("exception");
        }
        return balance;
    }
}

