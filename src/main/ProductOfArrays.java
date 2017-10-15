package main;

public class ProductOfArrays {

	
	
	public static void product(int[] a) {
		
		int[] product = new int[a.length];
		
		int j =0;
		
		while(j < a.length) {
			int mult = 1;
			for(int i = 0; i < a.length; i++) {
				if(i == j) {
					//do nothing
				}
				else {
					mult = mult *a[i];
				}
			}
			product[j] = mult;
			j++;
		}
		for(int i = 0; i<a.length; i++) 
			System.out.println(product[i]);
	}
	
	
	
	public static int[] product_without_self(int[] arr) {
	    int[] result = new int[arr.length];
	    result[result.length-1] = 1;
	  
	    for(int i = 0; i<arr.length; i++) 
			System.out.println("intially: "+result[i]);
	    
	    
	    for(int i=arr.length-2; i>=0; i--) {
	    	System.out.println(i+" = "+result[i+1]+" * "+arr[i+1]);
	        result[i] = result[i+1] * arr[i+1];
	        
	    }
	  
	    int left = 1;
	    for(int i=0; i<arr.length; i++) {
	        result[i] *= left;
	        left *= arr[i];
	    }
	  
	    return result;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,3,4};
		//product(a);
		product_without_self(a);
	}

}
