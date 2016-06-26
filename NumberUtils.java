package com.belatrix.project1;

public class NumberUtils {
	
	//attributes that can be used, need to be initialized in constructor
	//unused at the moment
	private int attribute1;
	private int attribute2;
	
	//if order is true, is ascended, else its descended
	public void sortIntArray(int[] array, boolean orderAsc ){
		
		while(! isSorted(array, orderAsc)){
			for(int i = 0; i < array.length-1; i++){
				if(comparatorInt(array[i], array[i+1], orderAsc))swap(array, i, i+1);
			}
		}
	}
	//returns true if is Sorted, false if not
	private boolean isSorted(int[] array, boolean orderAsc){
		for (int i = 0; i < array.length-1; i++)
			if (comparatorInt(array[i], array[i+1],orderAsc)) return false;
		return true;
	}
	
	//comparator method, takes 2 numbers and a boolean that determines 
	//the order wanted to compare
	//returns true if num1 is greater than num2 if asc is true
	//returns false if asc is false and num2 is greater than num1
	private boolean comparatorInt(int num1, int num2, boolean asc){
		if(asc) return num1>num2;
		return num2>num1;
	}
	//swap values in an array from two index
	private void swap(int[] array, int index1, int index2){
		if(array.length-1<index1 || array.length-1<index2) return;
		int aux = array[index1];
		array[index1] = array[index2];
		array[index2] = aux;
		
	}
	public void printAnIntArray(int[] array){
		
		for(int i = 0; i < array.length ; i++){
			
			System.out.print(array[i]);
			System.out.print(',');
			
		}

	}
}