
public class SelectionSort {
	
	
	
	public static void selectionSort( int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {             //time complexity (n*n)
			
			int min=i;
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min]>arr[j]) {         //find the smallest index
					min=j;		
				}
			}
			int temp=arr[min];    //swap it
			arr[min]=arr[i];
			arr[i]=temp;					
		}
		
		
	}

	public static void main(String[] args) {
		
		int [] arr= {2,3,4,5,2,345,67,84,1};
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {  
			System.out.println(arr[i]);
			
		}
		// TODO Auto-generated method stub

	}

}
