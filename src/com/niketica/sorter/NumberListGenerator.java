package com.niketica.sorter;

import java.util.ArrayList;
import java.util.Random;

public class NumberListGenerator {
	private int listLength;
	private int minValue;
	private int maxValue;
	
	public NumberListGenerator(int listLength, int minValue, int maxValue){
		this.listLength = listLength;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	public int[] generateNumberList(){
		int[] numberList = new int[listLength];
		Random rand = new Random();
		
		for(int i=0; i<listLength; i++){
			int nextNumber = rand.nextInt(maxValue - minValue);
			
			nextNumber += minValue;
			
			numberList[i] = nextNumber;
		}
		
		return numberList;
	}
	
	public static void printNumberList(int[] numberList){
		String strList = "";
		for(int i=0; i<numberList.length; i++){
			strList += numberList[i];
			
			if(i < (numberList.length - 1)){
				strList += "-";
			}
		}
		
		System.out.println(strList);
	}
	
	public static int[] convertArrayListToList(ArrayList<Integer> numberList){
		int[] newList = new int[numberList.size()];
		
		for(int i=0; i<numberList.size(); i++){
			newList[i] = numberList.get(i);
		}
		
		return newList;
	}
	
	public static ArrayList<Integer> convertListToArrayList(int[] numberList){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for(int i=0; i<numberList.length; i++){
			newList.add(numberList[i]);
		}
		
		return newList;
	}
}
