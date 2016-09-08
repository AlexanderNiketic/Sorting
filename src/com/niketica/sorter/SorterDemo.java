package com.niketica.sorter;

/**
 * SorterDemo is a basic class that showcases the different sorting methods.
 * @author Alexander
 */
public class SorterDemo {
	private int amountOfNumbersToSort = 500;
	private int minNumber = 1;
	private int maxNumber = 2000;
	
	public SorterDemo(){		
		startDemo();
	}
	
	/**
	 * Demonstrate the different sorting types.
	 */
	private void startDemo(){
		Sorter sorterBubble    = createSorter(SorterType.BUBBLE_SORT);
		Sorter sorterMerge 	   = createSorter(SorterType.MERGE_SORT);
		Sorter sorterInsertion = createSorter(SorterType.INSERTION_SORT);
		
		NumberListGenerator NLG = new NumberListGenerator(amountOfNumbersToSort, minNumber, maxNumber);
		int[] numberList = NLG.generateNumberList();
		
		System.out.println("Bubble Sort Example");
		startSort(sorterBubble, numberList);
		
		System.out.println("\nMerge Sort Example");
		startSort(sorterMerge, numberList);
		
		System.out.println("\nInsertion Sort Example");
		startSort(sorterInsertion, numberList);
	}

	/**
	 * Start sorting a random number list using a given sorter and record the time required.
	 * @param s The sorter used to sort the numbers.
	 * @param numberList The list of numbers to be sorted.
	 */
	private void startSort(Sorter s, int[] numberList){
		long startTime,	endTime, totalTime;
		int[] copyList = numberList.clone();
		
		NumberListGenerator.printNumberList(copyList);
				
		startTime  = System.currentTimeMillis();
		copyList = s.sortList(copyList);
		endTime    = System.currentTimeMillis();
		totalTime  = endTime - startTime;
		
		NumberListGenerator.printNumberList(copyList);
		System.out.println("Time: " + totalTime + " milliseconds.");
	}
	
	/**
	 * Create a sorter of the given type.
	 * @param type The type of the sorter.
	 * @return The created sorter.
	 */
	private Sorter createSorter(SorterType type) {
		Sorter s = null;
		
		try {
			s = SorterFactory.getSorter(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public static void main(String[] args){
		new SorterDemo();
	}
}
