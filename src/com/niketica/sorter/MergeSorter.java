package com.niketica.sorter;

import java.util.ArrayList;

public class MergeSorter extends Sorter {

	public int[] sortList(int[] numberList) {
		return splitList(numberList);
	}

	public int[] splitList(int[] numberList){
		ArrayList<Integer> oddsAL;
		ArrayList<Integer> evensAL;
		int[] odds;
		int[] evens;
		
		if(numberList.length <= 1){
			return numberList;
		}
		
		oddsAL = new ArrayList<Integer>();
		evensAL = new ArrayList<Integer>();
		
		for(int i=0;i<numberList.length; i++){
			if(i%2==0){
				evensAL.add(numberList[i]);
			}else{
				oddsAL.add(numberList[i]);				
			}
		}
		
		odds  = convertArrayListToList(oddsAL);
		evens = convertArrayListToList(evensAL);
		
		odds = splitList(odds);
		evens = splitList(evens);
		
		oddsAL = convertListToArrayList(odds);
		evensAL = convertListToArrayList(evens);
		
		return mergeList(evensAL, oddsAL);
	}
	
	private int[] convertArrayListToList(ArrayList<Integer> numberList){
		int[] newList = new int[numberList.size()];
		
		for(int i=0; i<numberList.size(); i++){
			newList[i] = numberList.get(i);
		}
		
		return newList;
	}
	
	private ArrayList<Integer> convertListToArrayList(int[] numberList){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for(int i=0; i<numberList.length; i++){
			newList.add(numberList[i]);
		}
		
		return newList;
	}
	
	private int[] mergeList(ArrayList<Integer> left, ArrayList<Integer> right){
		int[] result;
		ArrayList<Integer> resultAL = new ArrayList<Integer>();
		
		while(left.size() > 0 && right.size() > 0){
			if(left.get(0) <= right.get(0)){
				resultAL.add(left.get(0));
				left.remove(0);
			}else{
				resultAL.add(right.get(0));	
				right.remove(0);
			}
		}
		
		if(left.size() > 0){
			resultAL.addAll(left);
		}else if(right.size() > 0){
			resultAL.addAll(right);
		}
		
		result = convertArrayListToList(resultAL);
				
		return result;
	}
}
