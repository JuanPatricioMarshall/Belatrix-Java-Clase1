package com.belatrix.project1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApp {
	 
	//Main method of class MyApp, 
	public static void main(String[] args) {
		
		int [] numbers = {0,1,9,12,8,0,2,6,22,11,3,4,5,6,7,8};
		NumberUtils numberUtil = new NumberUtils();
		Scanner orderParameterScanner = new Scanner(System.in);
		System.out.println("Ingrese Ascendente si quiere ordenar de menor a mayor, sino se ordenara mayor a menor");
		String orderInput = orderParameterScanner.nextLine();
		boolean orderAsc = orderInput.equals("Ascendente");
		numberUtil.sortIntArray(numbers, orderAsc);
		numberUtil.printAnIntArray(numbers);
	}


}
