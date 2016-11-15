package QuickCoding04;

public class testMain {
	public static BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread depositMan = new Thread(){
			public void run(){
				for(int i = 0; i< 10; i++){
					account.Deposit(10);
					try{
						Thread.sleep((int)(Math.random() * 1000));
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		
		Thread withdrawMan = new Thread(){
			public void run(){
				for(int i=0 ; i<10 ; i++){
					account.Withdraw(10);
					try{
						Thread.sleep((int)(Math.random() * 1000));
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		depositMan.start();
		withdrawMan.start();
		
	}

}
