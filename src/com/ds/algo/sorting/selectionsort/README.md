# Selection Sort

## Introduction
The Selection Sort algorithm repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning to sort an array.

The algorithm divides the input list into two parts: a sorted sublist of items which is built up from left to right at the front (left) of the list and a sublist of the remaining unsorted items that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.

## Performance

Number of comparisons: (n - 1) + (n - 2) + (n - 3) + ..... + 1 = n(n - 1) / 2 nearly equals to n2

Complexity = O(n^2)

Best Case Scenario = O(n^2)
Average Case Scenario = O(n^2)
Worst Case Scenario = O(n^2)

The selection sort should be used when

- A small list is to be sorted
- Cost of swapping does not matter
- Checking of all the elements is compulsory
- Cost of writing to a memory matters like in flash memory (number of writes/swaps is O(n) as compared to O(n2) of bubble sort)

## Example

arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]<br>
// and place it at beginning<br>
11 25 12 22 64<br>

// Find the minimum element in arr[1...4]<br>
// and place it at beginning of arr[1...4]<br>
11 12 25 22 64<br>

// Find the minimum element in arr[2...4]<br>
// and place it at beginning of arr[2...4]<br>
11 12 22 25 64<br>

// Find the minimum element in arr[3...4]<br>
// and place it at beginning of arr[3...4]<br>
11 12 22 25 64 <br>