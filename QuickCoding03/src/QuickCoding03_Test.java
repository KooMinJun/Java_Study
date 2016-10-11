import java.util.Scanner;

public class QuickCoding03_Test {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Divide div = new Divide();
		int num1, num2;
		String str_num1, str_num2;
		try{
			System.out.println("num1을 입력하세요");
			str_num1 = sc.nextLine();
			num1 = Integer.parseInt(str_num1);
			System.out.println("num2를 입력하세요");
			
			str_num2 = sc.nextLine();
			num2 = Integer.parseInt(str_num2);
			if(num1 >= 100 | num2 >= 100)
				throw new MyException("100이상은 나누기 안돼요");
			
			div.divide(num1,  num2);			
		}catch(ArithmeticException e){
			System.out.println("숫자 0으로 나눌 수 없습니다"  + e.toString());
		}catch(NumberFormatException e){
			System.out.println("문자는 나누기가 안됩니다" + e.toString());
		}catch(MyException e){
			System.out.println("100 이상으로는나누기가 안됩니다." + e.toString());
		}
		
	}
	
}
