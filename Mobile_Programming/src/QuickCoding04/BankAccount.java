package QuickCoding04;

public class BankAccount {
	private int balance = 100;
	
	public int getBalance(){
		return balance;
	}
	
	
	public synchronized void Deposit(int money){
		balance += money;
		System.out.println("����  : " + balance + ", " + money + "��ŭ �Ա�");
	}
	
	public synchronized void Withdraw(int money){
		balance -= money;
		System.out.println("���� : " + balance + ", " + money + "��ŭ ���");
	}
}
