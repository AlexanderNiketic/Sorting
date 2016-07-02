package com.niketica.sorter;

/**
 * This class sorts a given list of numbers via the bubble sort method.
 * @author Alexander
 *
 */
public class BubbleSorter extends Sorter {

	public int[] sortList(int[] numberList){
		return bubbleSort(numberList);
	}
	
	/**
	 * This is a recursive method that goes through the entire list of numbers and swaps each neighbouring number when needed.
	 * When there is no swap, the recursion ends. 
	 * @param numberList The list of numbers to be sorted.
	 * @return The sorted list of numbers.
	 */
	public int[] bubbleSort(int[] numberList){
		boolean hasSwapped = false;
		
		for(int i=0; i<(numberList.length-1); i++){
			int num1 = numberList[i];
			int num2 = numberList[i + 1];
			
			if(num1 > num2){
				numberList[i] = num2;
				numberList[i + 1] = num1;
				hasSwapped = true;
			}
		}
		
		if(hasSwapped){
			sortList(numberList);
		}
		
		return numberList;
	}
}
