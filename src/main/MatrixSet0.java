package main;

public class MatrixSet0 {
	
	
	public static int[][] setMatrix(int[][] givenMatrix) {
		
		int[] row = new int[givenMatrix.length];
		int[] column = new int[givenMatrix[0].length];
		
		for(int i =0; i < givenMatrix.length; i++) {
			for (int j = 0; i< givenMatrix[0].length; j++) {
				
				if(givenMatrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		// Set arr[i][j] to 0 if either row i or column j has a 0 
		for (int i = 0; i < givenMatrix.length; i++) {
			for (int j = 0; j < givenMatrix[0].length; j++) { 
				if ((row[i] == 1 || column[j] == 1)) {
					givenMatrix[i][j] = 0; 
				}
			} 
		}
		return givenMatrix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
