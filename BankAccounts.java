package samreen;

public class BankAccounts {
private double balance;
public BankAccounts(double initialBalance)
{
if (initialBalance >=0){
	this.balance = initialBalance;
}
else{
	System.out.println("initial balance account be negative");
	this.balance=0;
}
}
public void deposit(double amount){
	if (amount >0){
		balance+=amount;
		System.out.println("deposited:"+amount);
	}
	else{
		System.out.println("deposit not possible");
	}
	
}
public void withdraw(int amount){
	if (amount >0){
		if(amount <=balance){
			balance-=amount;
			System.out.println("withdraw:"+amount);
		}else{
			System.out.println("no money");
		}
	}else{
		System.out.println("withdraw not sufficient");
	}
}
	public void checkbalance(){
		System.out.println("current balance:"+balance);
	}


	public static void main(String args[]){
		BankAccounts myaccount=new BankAccounts(100);
		myaccount.deposit(200);
		myaccount.withdraw(150);
		myaccount.checkbalance();
	
		
		
	}
}


