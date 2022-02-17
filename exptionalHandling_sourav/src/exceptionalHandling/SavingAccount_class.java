package exceptionalHandling;

public class SavingAccount_class {

    public long id = 1245;

    private double balance = 3000;

    public double balance() {
        return balance;
    }

    public void withdraw(double amount) throws InSufficientFundException {
        if (amount > balance) {
            throw new InSufficientFundException(String.format(
                    "Current balance %d is less than requested amount %d",
                    balance, amount));
        }
        balance = balance - amount;
        if (amount < 0)
        {
            throw new IllegalArgumentException(String.format(
                    "IllegalBankTransactionException: Amount cannot be negative %s", amount));
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(String.format(
                    "Invalid deposit amount %s", amount));
        }
    }

}