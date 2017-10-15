package main;
import java.util.HashMap;
import java.util.Scanner;


public class RectanglesOverlap {

	 /*long get_count(int[] a, int k) {
		 	HashMap<Integer,Integer> cnt_mod = new HashMap<>();
		 	//cnt_mod.put(0, 1);
		 	int pref_sum = 0;
	  //Iterate over the input sequence.
	  for (int elem : a) {
	    pref_sum += elem;
	    pref_sum %= k;
	    cnt_mod[pref_sum]++;
	  }
	  //Compute the answer.
	  long res = 0;
	  for (int mod = 0; mod < k; mod++)
	    res += (long)cnt_mod[mod] * (cnt_mod[mod] - 1) / 2;
	  return res;
	  
	 } */
	
	static int  kSub(int k, int[] nums) {
		int subCount = 0;
		int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	sum = nums[i];
        	if(sum%k == 0) {
            	//System.out.println(sum);
                subCount++;
            }
            for(int j = i; j<nums.length-1; j++) {
            	if(nums[j]+1 == nums[j+1]) {
            		//System.out.println(sum+" "+nums[j+1]);
                    sum = sum+nums[j+1]; 
                    if(sum%k == 0) {
                    	
                    	subCount++;
                    	//System.out.println("subCount: "+subCount);
                        
                    }
                 }
            	
            	else break;
                
            }
            
        }
        System.out.println(subCount);
        return subCount;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int k = in.nextInt();
		int len = in.nextInt();
		int[] a = new int[len];
		
		for(int i = 0; i < len; i++) {
			a[i] = in.nextInt();
		}
		kSub(k,a);
	}
}
