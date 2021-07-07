/**
 * 
 */
package com.ds.algo.sorting;

/**
 * @author himanshugupta
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = {1,55,123,77,45,-44,-98,234, 0, 544, -998, 123};
		int count = 0;
			
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println("**********************");
		
		for(int i = 0; i < array.length;i++) {
			for(int y = i+1; y < array.length; y++)
			{
				if(array[i] < array[y]) {
					int temp = array[i];
					array[i] = array[y];
					array[y] = temp;
				}
				
				if(y == i) {
					continue;
				}
				count++;
			}
		}
	
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println("Number Of Iterations:" + count);
	}

}
