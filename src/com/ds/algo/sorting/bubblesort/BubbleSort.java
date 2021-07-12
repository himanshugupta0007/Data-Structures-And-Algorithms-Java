package com.ds.algo.sorting.bubblesort;

/**
 * This is an example class for Bubble Sort
 * 
 * @author Himanshu Gupta
 * @since 6 July, 20201
 * @version 1.0
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {

		// define your array
		int array[] = { 1, 55, 123, 77, 45, -44, -98, 234, 0, 544, -998, 123 };

		// define counter to identify number of iterations for sorting
		int count = 0;

		System.out.println("Original Array :-");
		// print original array
		for (int i : array) {
			System.out.println(i);
		}

		for (int i = 0; i < array.length; i++) {
			for (int y = i + 1; y < array.length; y++) {

				// swap the elements after comparison
				if (array[i] > array[y]) {
					int temp = array[i];
					array[i] = array[y];
					array[y] = temp;
				}

				if (y == i) {
					continue;
				}
				count++;
			}
		}

		System.out.println("Sorted Array :-");
		// print sorted array
		for (int i : array) {
			System.out.println(i);
		}

		System.out.println("Number Of Iterations:" + count);
	}

}
