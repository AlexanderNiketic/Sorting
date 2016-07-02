package com.niketica.sorter;

/**
 * This class acts as a template for all sorter classes.
 * @author Alexander
 *
 */
public abstract class Sorter {
	private int[] numberList;
	
	/**
	 * This method is a template to sort a list of numbers. 
	 * The actual algorithm will be specified in the specific sorting classes.
	 * @param numberList The list of numbers to be sorted.
	 * @return A sorted list of numbers.
	 */
	public abstract int[] sortList(int[] numberList);

	public int[] getSortedList(){
		return numberList;
	}
}
