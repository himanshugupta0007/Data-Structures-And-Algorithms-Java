package com.ds.algo.sorting.shellsort;

/**
 * This is an example class for Bubble Sort
 * 
 * @author Himanshu Gupta
 * @since 6 July, 20201
 * @version 1.0
 * 
 */
public class ShellSort {

	public static void main(String[] args) {

		// define your arrayay
		int array[] = { 1, 55, 123, 77, 45, -44, -98, 234, 0, 544, -998, 123 };

		// define counter to identify number of iterations for sorting
		int count = 0;

		System.out.println("Original arrayay :-");
		// print original arrayay
		for (int i : array) {
			System.out.println(i);
		}

		 int n = array.length;
		 
	        // Start with a big gap, then reduce the gap
	        for (int gap = n/2; gap > 0; gap /= 2)
	        {
	            // Do a gapped insertion sort for this gap size.
	            // The first gap elements a[0..gap-1] are already
	            // in gapped order keep adding one more element
	            // until the entire arrayay is gap sorted
	            for (int i = gap; i < n; i += 1)
	            {
	                // add a[i] to the elements that have been gap
	                // sorted save a[i] in temp and make a hole at
	                // position i
	                int temp = array[i];
	 
	                // shift earlier gap-sorted elements up until
	                // the correct location for a[i] is found
	                int j;
	                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
	                    array[j] = array[j - gap];
	 
	                // put temp (the original a[i]) in its correct
	                // location
	                array[j] = temp;
	            }
	        }

		System.out.println("Sorted arrayay :-");
		// print sorted arrayay
		for (int i : array) {
			System.out.println(i);
		}
	}

}
