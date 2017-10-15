package main;

public class StringReverse {

	
	public static String reverse(String s) {
		
		char[] temparray= s.toCharArray();
	    int left,right=0;
	    right=temparray.length-1;
	    for (left=0; left < right ; left++ ,right--)
	    {
	     // Swap values of left and right 
	     char temp = temparray[left];
	     temparray[left] = temparray[right];
	     temparray[right]=temp;
	    }
	    
		return temparray.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("hello");
	}

}
