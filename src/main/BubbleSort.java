package main;

public class BubbleSort {

	
	public static void bubbleSort(int[] a) {
		
		for(int i = a.length-1; i >0; i--) {
			for(int j = 0; j<i	; j++) {
				if(a[j] > a[j+1]) {
					System.out.println("swapping: "+a[j]+a[j+1]);
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					
				}
			}
		}
		for(int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,3,7,2,9,8,6,4};
		bubbleSort(a);
	}

}
