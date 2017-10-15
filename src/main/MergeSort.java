package main;

public class MergeSort {
	
	static int[] a = {4,6,3,2,1,9,7,0};
	static int[] result = new int[a.length];
	
	public static void mergeSort(int lowerBound, int upperBound, int[] a) {
		
		if(lowerBound == upperBound) {
			return;
		}
		
		else {
		
			int mid = (lowerBound+upperBound)/2;
		
			mergeSort(lowerBound, mid, a);
			mergeSort(mid+1, upperBound, a);
		
			merge(lowerBound, upperBound, mid, a);
		}
		
	}
	
	public static void merge(int lowerBound,int upperBound, int mid, int[] a ) {
		
		System.out.println("low: "+ a[lowerBound]+ " mid:"+a[mid+1]+" upper: "+a[upperBound]);
		
		int low = lowerBound;
		int high = mid+1;
		int j = 0;
		int n = upperBound-lowerBound+1; 
		
		while(low <= mid && high <= upperBound) {
			
			if(a[low] < a[high+1]) {
				result[j] = a[low];
			}
			else
				result[j] = a[high+1];
			
			high++;
			j++;
			low++;
		}
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mergeSort(0, a.length-1, a);
		for(int i = 0; i< result.length; i++) {
			System.out.print(result[i]);
		}
	}

}
