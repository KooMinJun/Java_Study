package QuickCoding00;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSort sorting = new BubbleSort();
		BinarySearch searching = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {3,1,4,2,6,8,5,9,7,10};
		int find_idx;
		
		int sortingArr[] = sorting.Sorting(arr);
		
		System.out.println("찾고싶은 숫자를 1부터 10 사이에서 입력하세요 : ");
		int searchNum = sc.nextInt();
		
		find_idx = searching.Searching(sortingArr, 0, arr.length-1, searchNum);
		if(find_idx == -1){
			System.out.println("찾는 숫자가 없습니다");
		}
		else{
			System.out.println("찾고자 하는 숫자는 " + (find_idx+1) + "번 째에 존재합니다.");
		}
	}

}
