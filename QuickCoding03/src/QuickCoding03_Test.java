import java.util.Scanner;

public class QuickCoding03_Test {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Divide div = new Divide();
		int num1, num2;
		String str_num1, str_num2;
		try{
			System.out.println("num1�� �Է��ϼ���");
			str_num1 = sc.nextLine();
			num1 = Integer.parseInt(str_num1);
			System.out.println("num2�� �Է��ϼ���");
			
			str_num2 = sc.nextLine();
			num2 = Integer.parseInt(str_num2);
			if(num1 >= 100 | num2 >= 100)
				throw new MyException("100�̻��� ������ �ȵſ�");
			
			div.divide(num1,  num2);			
		}catch(ArithmeticException e){
			System.out.println("���� 0���� ���� �� �����ϴ�"  + e.toString());
		}catch(NumberFormatException e){
			System.out.println("���ڴ� �����Ⱑ �ȵ˴ϴ�" + e.toString());
		}catch(MyException e){
			System.out.println("100 �̻����δ³����Ⱑ �ȵ˴ϴ�." + e.toString());
		}
		
	}
	
}
