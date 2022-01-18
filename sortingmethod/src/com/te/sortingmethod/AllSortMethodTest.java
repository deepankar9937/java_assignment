package com.te.sortingmethod;

import java.util.Arrays;
import java.util.Scanner;

public class AllSortMethodTest {
	public static void main(String[] args) {
		AllSortMethod allSortMethod = new AllSortMethod();
		
		System.out.println("Enter the No. of number You want to input : ");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int [] array = new int[count];
		System.out.println("Enter all the Numbers : ");
		
		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Your Entered Numbers are");
		System.out.println(Arrays.toString(array));
		
		System.out.println("After Bubble Sort : ");
		int[] bubbleSortResult = allSortMethod.bubbleSort(array);
		System.out.println(Arrays.toString(bubbleSortResult));
		
		System.out.println("After InsertionSort : ");
		int[] insertionSortResult = allSortMethod.insertionSort(array);
		System.out.println(Arrays.toString(insertionSortResult));
		
		System.out.println("After InsertionSort : ");
		int[] selectionSortResult = allSortMethod.selectionSort(array);
		System.out.println(Arrays.toString(selectionSortResult));
		
		System.out.println("After Quick Sort");
		int[] result = allSortMethod.quickSortRecursion(array, 0, count-1);
		System.out.println(Arrays.toString(result));
	}
}
