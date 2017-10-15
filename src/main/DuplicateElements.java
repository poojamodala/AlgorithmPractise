package main;
public class DuplicateElements {

	
	public static void removeDuplicates(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		
		int tail = 1;
		for(int i = 1; i < len; i++) { 
			int j;
			for (j = 0; j < tail; j++) {
				if (str[i] == str[j]) break; 
			}
			if (j == tail) { 
				System.out.println("condition satisfied for: "+j+tail);
				
				str[tail] = str[i];
				tail++; 
				for(int k=0;k<str.length;k++) {
					System.out.println(str[k]);
				}
			}
		}
		str[tail] = 0;
		
		for(int k=0;k<str.length;k++) {
			System.out.println("final: "+str[k]);
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] str = {'a', 'b','a','c','c','d','e'};
		removeDuplicates(str);
	}

}
