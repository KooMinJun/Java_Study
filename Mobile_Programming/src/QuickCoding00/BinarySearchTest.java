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
		
		System.out.println("ã����� ���ڸ� 1���� 10 ���̿��� �Է��ϼ��� : ");
		int searchNum = sc.nextInt();
		
		find_idx = searching.Searching(sortingArr, 0, arr.length-1, searchNum);
		if(find_idx == -1){
			System.out.println("ã�� ���ڰ� �����ϴ�");
		}
		else{
			System.out.println("ã���� �ϴ� ���ڴ� " + (find_idx+1) + "�� °�� �����մϴ�.");
		}
	}

}
