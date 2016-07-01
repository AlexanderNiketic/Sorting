package com.niketica.sorter;

public class SorterDemo {
	private NumberListGenerator NLG = new NumberListGenerator(20, 5, 100);
	private int[] numberList;
	private int[] sortedList;
	private Sorter s;
	
	public SorterDemo(){
		bubbleSort();
		System.out.println();
		mergeSort();
		System.out.println();
		insertionSort();
	}
	
	private void bubbleSort(){
		numberList = NLG.generateNumberList();
		s = SorterFactory.getSorter(SorterType.BUBBLE_SORT);
		
		System.out.println("Bubble Sort Example");
		NumberListGenerator.printNumberList(numberList);
		sortedList = s.sortList(numberList);
		NumberListGenerator.printNumberList(sortedList);
	}
	
	private void mergeSort(){
		numberList = NLG.generateNumberList();
		s = SorterFactory.getSorter(SorterType.MERGE_SORT);
		System.out.println("Merge Sort Example");
		NumberListGenerator.printNumberList(numberList);
		sortedList = s.sortList(numberList);
		NumberListGenerator.printNumberList(sortedList);
	}
	
	private void insertionSort(){
		numberList = NLG.generateNumberList();
		s = SorterFactory.getSorter(SorterType.INSERTION_SORT);
		System.out.println("Insertion Sort Example");
		NumberListGenerator.printNumberList(numberList);
		sortedList = s.sortList(numberList);
		NumberListGenerator.printNumberList(sortedList);		
	}
}
