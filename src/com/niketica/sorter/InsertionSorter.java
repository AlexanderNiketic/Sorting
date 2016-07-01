package com.niketica.sorter;

import java.util.ArrayList;

public class InsertionSorter extends Sorter {

	public int[] sortList(int[] numberList) {
		ArrayList<Integer> numberListAL = NumberListGenerator.convertListToArrayList(numberList);
		
		int i, j;
	    for (i = 1; i < numberListAL.size(); i++) {
	        int tmp = numberListAL.get(i);
	        j = i;
	        while ((j > 0) && (numberListAL.get(j - 1) > tmp)) {
	        	numberListAL.set(j, numberListAL.get(j - 1));
	            j--;
	        }
	        numberListAL.set(j, tmp);
	    }
		
		return NumberListGenerator.convertArrayListToList(numberListAL);
	}
	
}
