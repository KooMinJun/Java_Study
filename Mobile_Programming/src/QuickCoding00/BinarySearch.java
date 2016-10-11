package QuickCoding00;

public class BinarySearch {
	public int Searching(int arr[], int left, int right, int searchNum){
		int middle = (left + right) / 2;
		if(arr[middle] < searchNum)
			return Searching(arr, middle+1, right, searchNum);
		else if(arr[middle] > searchNum)
			return Searching(arr, left, middle-1, searchNum);
		else if(arr[middle] == searchNum)
			return middle;
		else
			return -1;
	}
	
}
