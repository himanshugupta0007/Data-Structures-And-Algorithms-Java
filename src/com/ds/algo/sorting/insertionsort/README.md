# Insertion Sort

## Introduction
Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

Insertion sort iterates, consuming one input element each repetition, and grows a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain

## Performance

Complexity = O(n^2)
Algo Type = Stable and In-Place


Best Case Scenario = O(n) where list is already sorted
Average Case Scenario = O(n^2)
Worst Case Scenario = O(n^2)

The selection sort should be used when

- A small list is to be sorted
- a small numbers are left for sorting

## Example

arr[] = 12, 11, 13, 5, 6<br>
Let us loop for i = 1 (second element of the array) to 4 (last element of the array)<br>
i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12 <br>
11, 12, 13, 5, 6<br>
i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13 <br>
11, 12, 13, 5, 6<br>
i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position. <br>
5, 11, 12, 13, 6<br>
i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position. <br>
5, 6, 11, 12, 13 <br>