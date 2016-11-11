package QuickCoding04;

public class BankAccount {
	private int balance = 100;
	
	public int getBalance(){
		return balance;
	}
	
	public void withDraw(int amount){
		balance -= amount ;
	}
	
	public synchronized void add(int money){
		balance += money;
		System.out.println("����  : " + balance + ", " + money + "��ŭ �Ա�");
	}
	
	public synchronized void delete(int money){
		balance -= money;
		System.out.println("���� : " + balance + ", " + money + "��ŭ ���");
	}
}
