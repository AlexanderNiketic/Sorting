package com.niketica.sorter;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class is used to generate numbers and convert ArrayLists to regular arrays, and the other way around.
 * @author Alexander
 *
 */
public class NumberListGenerator {
	private int listLength;
	private int minValue;
	private int maxValue;
	
	/**
	 * Initialize this class by giving it the desired length of the number list and the minimum and maximum possible value.
	 * @param listLength The number of numbers that will be generated.
	 * @param minValue The minimum possible value.
	 * @param maxValue The maximum possible value.
	 */
	public NumberListGenerator(int listLength, int minValue, int maxValue){
		this.listLength = listLength;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	/**
	 * This method will generate a list of random numbers.
	 * @return A list of random numbers.
	 */
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
	
	/**
	 * Convert an Integer ArrayList to a regular Integer array.
	 * @param numberList The ArrayList to be converted.
	 * @return The converted Integer array.
	 */
	public static int[] convertArrayListToList(ArrayList<Integer> numberList){
		int[] newList = new int[numberList.size()];
		
		for(int i=0; i<numberList.size(); i++){
			newList[i] = numberList.get(i);
		}
		
		return newList;
	}
	
	/**
	 * Convert an Integer array to an Integer ArrayList.
	 * @param numberList The Integer array to be converted.
	 * @return The converted ArrayList.
	 */
	public static ArrayList<Integer> convertListToArrayList(int[] numberList){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for(int i=0; i<numberList.length; i++){
			newList.add(numberList[i]);
		}
		
		return newList;
	}
}
