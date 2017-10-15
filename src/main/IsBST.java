package main;

public class IsBST {
	
	
	public static boolean isBST(Node curr, int max, int min) {
		
		if (curr.left != null) {
			 if (curr.left.data < min ||
			 !isBST(curr.left, min, curr.data))
			 return false;
			 }
			 if (curr.right != null) {
			 if (curr.right.data > max ||
			 !isBST(curr.right, curr.data, max))
			 return false;
			 }
			 return true;
	}

	public static void main(String[] args) {
		Node leaf1 = new Node(6, null, null);
		Node leaf2 = new Node(11,null,null);
		Node root1 = new Node(10, leaf1, leaf2);
		Node root2 = new Node(12,root1,null);
	}
	
	
	public static class Node {
		int data;
		Node left;
		Node right;
		public Node(int i, Node left2, Node right2) {
			data = i;
			left = left2;
			right = right2;
		}
	}
}
