/**
 * 
 */
package com.ds.algo.sorting.selectionsort;

/**
 * @author Himanshu Gupta
 * @since 6 July, 20201
 * @version 1.0
 *
 */
public class SelectionSorting {

	public static void main(String[] args) {
		// define your array
		int array[] = { 1, 55, 123, 77, 45, -44, -98, 234, 0, 544, -998, -123 };

		// define counter to identify number of iterations for sorting
		int count = 0;

		System.out.println("Original Array :-");
		// print original array
		for (int i : array) {
			System.out.println(i);
		}

		for (int i = 0; i < array.length; i++) {
			// assign first index as minimum
			int minimumindex = i;
			// iterate first loop to compare the minimum index element with rest of elements
			for (int y = i + 1; y < array.length; y++) {
				if (array[y] < array[minimumindex]) {
					// if any element is less than element at minimum index's element, assign
					// minimum element
					minimumindex = y;
				}
			}

			// swap the element at minimum index in front of list
			int temp = array[i];
			array[i] = array[minimumindex];
			array[minimumindex] = temp;

		}

		System.out.println("Sorted Array");
		for (int i : array) {
			System.out.println(i);
		}

	}
}
