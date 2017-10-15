package main;
import java.util.*;
//	import java.util.Map.Entry;


public class Vmware {
	
	static int longestPalSubstr(String str) {
        int maxLength = 1; 
 
        int len = str.length();
 
        int low, high;
 
        for (int i = 1; i < len; ++i) 
        {

            low = i - 1;
            high = i;
            while (low >= 0 && high < len
                    && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
 
            
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len
                    && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
        return maxLength;
    }

	public static void main(String[] args) {
		

	}

}
