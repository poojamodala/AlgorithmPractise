package main;

public class LongestSubstring {
	
	public static void longSubStr(String s, int m) {
		
		String largertSubString = "";
		int count = 1;
		int index = 0;
		char[] str = s.toCharArray();
		for(int i =0; i<str.length; i++) {
			if((str[i] != str[i+1])&&count!=m) {
				count++;
			}
			else if(count == m) {
				System.out.println(s.substring(index, count));
				break;
			}
			else {
				count = 1;
				index = i;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		longSubStr("abcbca", 2);
		
	}

}
