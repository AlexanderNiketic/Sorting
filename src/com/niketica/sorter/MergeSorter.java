package com.niketica.sorter;

import java.util.ArrayList;

/**
 * This class sorts a given list of numbers via the merge sort method.
 * @author Alexander
 *
 */
public class MergeSorter extends Sorter {

	public int[] sortList(int[] numberList) {
		ArrayList<Integer> numberListAL = NumberListGenerator.convertListToArrayList(numberList);
		
		numberList = NumberListGenerator.convertArrayListToList(splitList(numberListAL));
		
		return numberList;
	}
	
	/**
	 * This is a recursive method that splits a list of numbers in two.
	 * Both lists get merged again using the mergeList method and then returned.
	 * @param numberList The list to be split.
	 * @return The merged list.
	 */
	public ArrayList<Integer> splitList(ArrayList<Integer> numberList){
		ArrayList<Integer> odds = new ArrayList<Integer>();
		ArrayList<Integer> evens = new ArrayList<Integer>();
		
		if(numberList.size() <= 1){
			return numberList;
		}
		
		for(int i=0;i<numberList.size(); i++){
			if(i%2==0){
				evens.add(numberList.get(i));
			}else{
				odds.add(numberList.get(i));				
			}
		}
				
		odds = splitList(odds);
		evens = splitList(evens);
				
		return mergeList(evens, odds);
	}
	
	/**
	 * This method merges two lists of numbers together into one list.
	 * @param left One of the lists to be merged.
	 * @param right One of the lists to be merged.
	 * @return The merged list.
	 */
	private ArrayList<Integer> mergeList(ArrayList<Integer> left, ArrayList<Integer> right){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(left.size() > 0 && right.size() > 0){
			if(left.get(0) <= right.get(0)){
				result.add(left.get(0));
				left.remove(0);
			}else{
				result.add(right.get(0));	
				right.remove(0);
			}
		}
		
		if(left.size() > 0){
			result.addAll(left);
		}else if(right.size() > 0){
			result.addAll(right);
		}
				
		return result;
	}
}
