package main;

public class StringUnique {

	
	public static boolean unique() {
		String str = "avfsgrssaea";
				boolean[] charSet = new boolean[256];
				for(int i = 0; i<str.length(); i++) {
					int val = str.charAt(i);
					System.out.println(charSet[val]);
					if(charSet[val]) return false;
					charSet[val] = true;
				}
				return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		unique();
	}

}
