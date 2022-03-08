package io.bank;

public class BankAccountepositoryImpl implements BankAccountRepository {
	
	private BankAccount bankAccount1;
    private BankAccount bankAccount2;
    
    public BankAccountepositoryImpl() {}
	public BankAccountepositoryImpl(BankAccount bankAccount1, BankAccount bankAccount2) {
		super();
		this.bankAccount1 = bankAccount1;
		this.bankAccount2 = bankAccount2;
	}
    
	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		 if(this.bankAccount1.getAccountId()==accountId)
		 {
	           return bankAccount1.getAccountBalance();
	        }
	        else
	        {
	           return  bankAccount2.getAccountBalance();
	        }
	}
	
	@Override
	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		double updatedBal=0;
		
        if(this.bankAccount1.getAccountId()==accountId){
            updatedBal = newBalance;
            bankAccount1.setAccountBalance(updatedBal);
        }
        else{
            updatedBal = newBalance;
            bankAccount2.setAccountBalance(updatedBal);
        }

       return updatedBal;
	}
    
}
