import java.util.ArrayList;
import java.util.List;

    class CurrentAccount extends Oops_Q3 {
        int creditLimit = 2000;
        public CurrentAccount(String name) {
            super(name);
        }
        @Override
        public int withdraw(int amount) {
            if (getCash() > amount) {
                totalDeposits -= amount;
                return -(amount);
            }
            else if((getCash()+creditLimit)>amount){
                this.creditLimit -= amount-totalDeposits;
                totalDeposits -= amount;
                return -(amount);
            }
            else {
                return 0;
            }
        }
        @Override
        public int getCash() {
            return (totalDeposits);
        }
    }
    class SavingsAccount extends Oops_Q3 {
        int fixedDepositAmount = 5000;

        public SavingsAccount(String name) {
            super(name);
        }

        @Override
        public int getCash() {
            return (fixedDepositAmount+totalDeposits);
        }
        @Override
        public int withdraw(int amount) {
            if (getCash() > amount) {
                totalDeposits -= amount;
                return -(amount);
            } else {
                return 0;
            }
        }

    }
    public  class Oops_Q3 {
        static ArrayList<Integer> totalCashInBank;
        private String name;
        protected int totalDeposits=0;
        public Oops_Q3(String name) {
            this.name = name;
        }
        public int deposit(int amount) {
            this.totalDeposits += amount;
            return amount;
        }
        public int withdraw(int amount) {
            if (totalDeposits > amount) {
                totalDeposits -= amount;
                return -amount;
            } else {
                return 0;
            }
        }
        public static int totalCashInBank(ArrayList<Integer> cash){
            int total = 0;
            for(int i =0;i<cash.size();i++){
                total += cash.get(i);
            }
            return total;
        }
        public int getCash(){
            return totalDeposits;
        }
        public static void main(String[] args) {
            totalCashInBank = new ArrayList<Integer>();
            Oops_Q3 acc1 = new SavingsAccount("acc1");
            Oops_Q3 acc2 = new CurrentAccount("acc2");
            SavingsAccount acc3 = new SavingsAccount("acc3");
            CurrentAccount acc4 = new CurrentAccount("acc4");
            totalCashInBank.add(acc1.deposit(100));
            totalCashInBank.add(acc2.deposit(3000));
            totalCashInBank.add(acc3.deposit(400));
            totalCashInBank.add(acc4.deposit(300));
            totalCashInBank.add(acc3.withdraw(400));
            totalCashInBank.add(acc2.withdraw(3300));
            System.out.println(totalCashInBank((totalCashInBank)));
        }
    }

