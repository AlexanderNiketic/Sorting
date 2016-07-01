package com.niketica.sorter;

public abstract class Sorter {
	private int[] numberList;
	
	public abstract int[] sortList(int[] numberList);
	
	public void setNumberList(int[] numberList){
		this.numberList = numberList;
	}
	
	public int[] getSortedList(){
		return numberList;
	}
}
