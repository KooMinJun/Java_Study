package QuickCoding04;

public class BankAccount {
	private int balance = 100;
	
	public int getBalance(){
		return balance;
	}
	
	
	public synchronized void Deposit(int money){
		balance += money;
		System.out.println("총합  : " + balance + ", " + money + "만큼 입금");
	}
	
	public synchronized void Withdraw(int money){
		balance -= money;
		System.out.println("총합 : " + balance + ", " + money + "만큼 출금");
	}
}
