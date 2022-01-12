package com.array;

public class MergeTwoArray {
	
	public static int [] merge (int [] array1, int [] array2) {
	
		int size1 = array1.length;
		int size2 = array2.length;
		
		int [] merged = new int [size1 + size2];
		
		int i = 0;
		int j = 0;
		
		//merged array index
		int k = 0;
		
		//loop both the arrays together
		while (i < size1 && j < size2) {
			
			if (array1 [i] <= array2 [j]) {
				merged [k] = array1 [i++];
			} else {
				merged [k] = array2[j++];
			}
			k++;
		}
		
		
		//Handle any additional elements in either array
		
		while (i < size1) {
			merged [k++] = array1 [i++];
		}
		
		while (j < size2) {
			merged [k++] = array2 [j++];
		}
		
		return merged;
	}
	
	public static void main(String[] args) {
		
		int [] array1 = {1, 3, 5, 7, 9};
		int [] array2 = {2, 4, 6, 8, 10};

		
		int [] merged = MergeTwoArray.merge(array1, array2);
		
		for (int n : merged) {
			System.out.println(n);
		}
	}
}
