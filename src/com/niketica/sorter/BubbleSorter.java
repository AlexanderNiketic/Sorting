package com.niketica.sorter;

public class BubbleSorter extends Sorter {

	public int[] sortList(int[] numberList){
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
