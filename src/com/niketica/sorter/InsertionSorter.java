package com.niketica.sorter;

import java.util.ArrayList;

/**
 * This class sorts a given list of numbers via the insertion sort method.
 * @author Alexander
 *
 */
public class InsertionSorter extends Sorter {

	public int[] sortList(int[] numberList) {
		ArrayList<Integer> numberListAL = NumberListGenerator.convertListToArrayList(numberList);
		
		numberListAL = insertionSort(numberListAL);
		
		return NumberListGenerator.convertArrayListToList(numberListAL);
	}
	
	/**
	 * This method loops through each number and checks if it can be put in order in front.
	 * @param numberList A list of numbers to be sorted.
	 * @return The sorted list of numbers.
	 */
	private ArrayList<Integer> insertionSort(ArrayList<Integer> numberList){		
		int i, j;
	    for (i = 1; i < numberList.size(); i++) {
	        int tmp = numberList.get(i);
	        j = i;
	        while ((j > 0) && (numberList.get(j - 1) > tmp)) {
	        	numberList.set(j, numberList.get(j - 1));
	            j--;
	        }
	        numberList.set(j, tmp);
	    }
		
		return numberList;
	}
	
}
