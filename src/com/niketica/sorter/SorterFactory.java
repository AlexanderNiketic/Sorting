package com.niketica.sorter;

public class SorterFactory {
	
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
