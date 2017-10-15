package main;

public class QuickSort {
	static int a[] = {4,6,3,2,1,9,7,0};
	
	public static void quickSort(int low, int high) {
		
		int par = high;
		if(high-low<=0) {
			return;
		}
		else {
			par = pivot(low, par);
			System.out.println("par is: "+a[par]);
			quickSort(low, par-1);
			quickSort(par, high);
		}
		
	}
	
	private static int pivot(int left, int right) {
		// TODO Auto-generated method stub
		
		int pivot = right;
		
		for(int i = 0; i < a.length;i++) {
			
			if(a[i] < a[right]) {
				continue;
			}
			else {
				System.out.println("swap: "+a[i]+a[right]);
				int tmp = a[i];
				a[i]=a[right];
				a[right]=tmp;
				pivot = i;
				return pivot;
			}
			
		}
		System.out.println("After Swapping: ");
		for(int i = 0; i<a.length;i++) {
			System.out.print(""+a[i]);
		}
		return pivot;
	}

	
	public static void main(String[] args) {
		
		quickSort(0, a.length-1);
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
