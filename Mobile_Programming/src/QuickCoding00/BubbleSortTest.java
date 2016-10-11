package QuickCoding00;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,4,5,2,6,7,9,8,10};
		BubbleSort sorting = new BubbleSort();
		
		int sortingArr[] = sorting.Sorting(arr);
		
		for(int i=0; i<arr.length; i++){
			System.out.print(sortingArr[i] + " ");
		}
		
		System.out.println("");
	}

}
