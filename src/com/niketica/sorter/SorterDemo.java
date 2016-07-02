package com.niketica.sorter;

/**
 * SorterDemo is a basic class that showcases the different sorting methods.
 * @author Alexander
 */
public class SorterDemo {
	
	public SorterDemo(){
		startSort(SorterType.BUBBLE_SORT);
		startSort(SorterType.MERGE_SORT);
		startSort(SorterType.INSERTION_SORT);
	}

	/**
	 * Start sorting a random number list using a given sorter type.
	 * @param type The sorting type used to sort the numbers.
	 */
	private void startSort(SorterType type){
		NumberListGenerator NLG = new NumberListGenerator(20, 5, 100);
		int[] numberList = NLG.generateNumberList();
		int[] sortedList;
		Sorter s;
		
		switch(type){
		case MERGE_SORT:
			s = SorterFactory.getSorter(SorterType.MERGE_SORT);
			System.out.println("Merge Sort Example");
			break;
		case BUBBLE_SORT:
			s = SorterFactory.getSorter(SorterType.BUBBLE_SORT);
			System.out.println("Bubble Sort Example");
			break;
		case INSERTION_SORT:
		default:
			s = SorterFactory.getSorter(SorterType.INSERTION_SORT);
			System.out.println("Insertion Sort Example");
		}
		
		NumberListGenerator.printNumberList(numberList);
		sortedList = s.sortList(numberList);
		NumberListGenerator.printNumberList(sortedList);
		System.out.println();
	}
}
