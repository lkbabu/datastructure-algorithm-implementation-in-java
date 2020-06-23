
public class QuickSort {
	
	
	
	public static void quickSort(int [] arr,int s,int e) {  
		
		if(s<e) {
			
			int pivot=partition(arr,s,e);   //will return the partition index
			
			quickSort(arr, s, pivot-1);     //left of the pivot
			
			quickSort(arr, pivot+1, e);		//right of the pivot
			
		}	
		
	}
	
	public static int partition(int [] arr,int s,int e) {
		
		int pivot=arr[e];   //we take the last element as pivot .the left of the pivot will be smaller and the right of the pivot will be larger numbers.
		int pindex=s;   //start index as partition index
		
		for (int i = s; i <=e-1;i++){
		if(arr[i]<=pivot) {
			
			int temp=arr[i];
			arr[i]=arr[pindex];     //swap
			arr[pindex]=temp;
			pindex++;			
		}			
			}
		int temp=arr[pindex];
		arr[pindex]=pivot;    //swap
		arr[e]=temp;
	    return pindex;       //return the partion index.
		
			
		}
		
	
	
public static void main(String[] args) {
		
		int [] arr= {2,3,4,5,2,2341243,345,67,84,1};
		
		quickSort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
}

}
