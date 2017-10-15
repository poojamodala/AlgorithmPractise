package main;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionPrint {
	
	static void StairCase(int n) {
		
		System.out.println("hello");
		int k = n;
        while (k>0) {
            for(int i = 0; i<k;i++){
                System.out.print(" ");
            }
            for(int i = k; i<n;i++){
                System.out.print("#");
            }
            System.out.println();
            k--;
        }

    }

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        StairCase(6);
        
    }
}