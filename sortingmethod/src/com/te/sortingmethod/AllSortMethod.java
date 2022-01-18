package com.te.sortingmethod;

public class AllSortMethod {
	public static int[] bubbleSort(int array[]) {
		int count = array.length;
		for (int i = 0; i < count - 1; i++) {
			for (int j = 0; j < count - i - 1; j++) {
				if (array[j] > array[j + 1]) {
				
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array) {
		int temp, j;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i;
			
			while (j > 0 && array[j -1] > temp) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;
		}
		return array;
	}
	
	public static int[] selectionSort(int array[]) {
		
		int min, temp=0;
		for (int i = 0; i < array.length; i++) {
			min =i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[min]) {
					min=j;
				}
			}
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		
		return array;
	}
	
	public static int quickSort(int array[], int low, int high) {
		int pivot = array[(low + high) / 2];
		while (low <= high) {
			while (array[low] < pivot) {
				low++;
			}
			while (array[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	
	}
	
	public int[] quickSortRecursion(int[] array, int low, int high) {
		int pi = quickSort(array , low, high);
		if (low < pi - 1) {
			quickSortRecursion(array, low, pi - 1);
			return array;
		}
		if (pi < high) {
			quickSortRecursion(array, pi, high);
			return array;
		}
		return array;
		
	}
}
