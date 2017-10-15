package main;

public class SelectionSort {

	
	public static void selectionSort(int[] a) {
		
		
		for(int i =0; i < a.length; i++) {
			int min = i;
			
			for(int j = a.length-1; j>i; j--) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			if(min != i) {
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
				
			}
		}
		for(int k =0; k< a.length; k++) {
			System.out.print(a[k]);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,6,3,2,1,9,7,0};
		selectionSort(a);

	}

}
