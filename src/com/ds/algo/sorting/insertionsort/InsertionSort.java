/**
 * 
 */
package com.ds.algo.sorting.insertionsort;

/**
 * @author Himanshu Gupta
 * @since 6 July, 20201
 * @version 1.0
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		// define your array
		int array[] = { 1, 55, 123, 77, 45, -44, -98, 234, 0, 544, -998, -123 };

		System.out.println("Original Array :-");
		// print original array
		for (int i : array) {
			System.out.println(i);
		}

		// Insertion Sort Algorithm Begins
		for (int i = 1; i < array.length; i++) {

			// save the first element assuming first element is sorted
			int key = array[i];
			int insertStep;
			// Compare key with each element on the left of it until an element smaller than
		    // it is found.
			for (insertStep = i; insertStep > 0 && array[insertStep - 1] > key; insertStep--) {
				array[insertStep] = array[insertStep - 1];
			}
			//insert the key at start of the array
			array[insertStep] = key;
		}

		System.out.println("\nSorted Array");
		for (int i : array) {
			System.out.println(i);
		}

	}
}
