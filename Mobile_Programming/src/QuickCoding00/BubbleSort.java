package QuickCoding00;

public class BubbleSort {
	public int[] Sorting(int arr[]){
		int len = arr.length;
		int temp;
		int sortingArr[] = arr;
		
		for(int i=0 ; i<len-1 ; i++){
			for(int j=0 ; j<len-1-i ; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					/* ���������� sorting�Ǵ��� Ȯ���ϴ� �κ�
					for(int a=0; a<len ;a++){
						System.out.print(arr[a] + " ");
					}
					System.out.println("");
					*/
				}
			}
		}
		
		return sortingArr;
	}
}
