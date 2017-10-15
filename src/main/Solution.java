package main;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

	/*
	 * Complete the function below.
	 */
		static int count = 0;
	    static int searchNodes(Node root, int value) {
	        
	        
	    	while (root.value < value && root.next != null) {
	            root = root.next;
	            count++;
	        }
	    	
	    	if(root.value != value) {
	    		root = root.below;
	    		count++;
	    		searchNodes( root, value);
	    	}

	        return value;
	    }


static class Node {
    int value;
    Node next;
    Node below;
    
    Node(int value) {
        this.value = value;
    }
}

public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    final String fileName = System.getenv("OUTPUT_PATH");
    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
    int res;
    
    int _nodes_rows = 0;
    _nodes_rows = Integer.parseInt(in.nextLine().trim());

    Node root = new Node(0);
    Node lineHead = null;
    Node aboveNode = null;

    for(int _nodes_i=0; _nodes_i<_nodes_rows; _nodes_i++) {
        if (lineHead == null) {
            lineHead = root;
            aboveNode = null;
        } else {
            lineHead.below = new Node(lineHead.value);
            aboveNode = lineHead;
            lineHead = lineHead.below;
        }
        Node current = lineHead;

        String[] stringArray = in.nextLine().split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
          String numberAsString = stringArray[i];
          intArray[i] = Integer.parseInt(numberAsString);
        }

        for (int nextInt : intArray) {
            while (aboveNode != null && aboveNode.next != null && nextInt > aboveNode.next.value) {
                aboveNode = aboveNode.next;
                current.next = new Node(aboveNode.value);
                current = current.next;
                aboveNode.below = current;
            }
            current.next = new Node(nextInt);
            current = current.next;
        }
        while (aboveNode != null && aboveNode.next != null) {
            aboveNode = aboveNode.next;
            current.next = new Node(aboveNode.value);
            current = current.next;
            aboveNode.below = current;
        }
    }


    int _value;
    _value = Integer.parseInt(in.nextLine().trim());

    res = searchNodes(root, _value);
    bw.write(String.valueOf(res));
    bw.newLine();
    
    bw.close();
}
}