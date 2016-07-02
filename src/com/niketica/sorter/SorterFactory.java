package com.niketica.sorter;

/**
 * This class provides a sorter of the given type.
 * @author Alexander
 */
public class SorterFactory {
	
	/**
	 * This method can be called to get a sorter of a given type.
	 * @param type The sorter type that is required.
	 * @return A sorter of the given type.
	 */
	public static Sorter getSorter(SorterType type){
		switch(type){
		case BUBBLE_SORT:
			return new BubbleSorter();
		case MERGE_SORT:
			return new MergeSorter();
		case INSERTION_SORT:
			return new InsertionSorter();
		default:
			return null;
		}
	}

}
