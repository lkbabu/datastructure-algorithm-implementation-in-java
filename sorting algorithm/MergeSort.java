
class MergeSort { 
	
	
	public static void mergeSort(int [] arr,int [] helper,int l,int h) {
		if(l<h){
		
		int mid=(l+h)/2;
		mergeSort(arr, helper, l, mid);
		mergeSort(arr, helper, mid+1, h);
		merge(arr,helper,l,mid,h);
		}
	}
	public static void merge(int [] arr,int[] helper,int l, int mid, int h) {                                       
		System.out.println(l+" "+mid+" "+h);
		
		for (int i = l; i <=h; i++) {
			helper[i]=arr[i];					
		}
		int left_index=l;
		int right_index=mid+1;
		
		int pointer=l;
		while(left_index<=mid && right_index <= h) {
			
			if(helper[left_index]<=helper[right_index]) {
				
				arr[pointer]=helper[left_index];
				left_index++;
				
			}
			else {
				arr[pointer]=helper[right_index];
				right_index++;			
				
			}
			pointer++;				
		}
		
		while(left_index<=mid) {
			arr[pointer]=helper[left_index];
			pointer++;
			left_index++;
			
		}
		while(right_index<=h) {
			arr[pointer]=helper[right_index];
			pointer++;
			right_index++;
			
		}
			
		
	}

	public static void main(String args[]) 
	{ 
		int arr[] = { 4, 0, 8, 6, 5, 3,7 }; 
		int [] helper= new int [arr.length];
		
		mergeSort(arr, helper, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}

	} 
} 

