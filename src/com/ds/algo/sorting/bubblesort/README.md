# Bubble Sort

## Introduction

Bubble Sort is the most straightforward sorting algorithm that repeatedly iterates the list, compares the adjacent items, and swaps them if 
they are in the wrong order. The iteration continues until the list is sorted.

## Performance

Bubble Sort has Best Case Complexity of O(n) means the list the is already sorted and Worst and Average Case Complexity of O(n^2) where n is number of item being sorted. 

## Example

Take an array of numbers " 5 1 4 2 8", and sort the array from lowest number to greatest number using bubble sort. In each step, elements written in bold are being compared. Three passes will be required <br>

**First Pass**<br><br>
( 5 1 4 2 8 ) → ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. <br>
( 1 5 4 2 8 ) → ( 1 4 5 2 8 ), Swap since 5 > 4<br>
( 1 4 5 2 8 ) → ( 1 4 2 5 8 ), Swap since 5 > 2<br>
( 1 4 2 5 8 ) → ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.<br><br>
**Second Pass**<br><br>
( 1 4 2 5 8 ) → ( 1 4 2 5 8 )<br>
( 1 4 2 5 8 ) → ( 1 2 4 5 8 ), Swap since 4 > 2<br>
( 1 2 4 5 8 ) → ( 1 2 4 5 8 )<br>
( 1 2 4 5 8 ) → ( 1 2 4 5 8 )<br><br>
Now, the array is already sorted, but the algorithm does not know if it is completed. The algorithm needs one additional whole pass without any swap to know it is sorted.<br>

**Third Pass**<br><br>
( 1 2 4 5 8 ) → ( 1 2 4 5 8 )<br>
( 1 2 4 5 8 ) → ( 1 2 4 5 8 )<br>
( 1 2 4 5 8 ) → ( 1 2 4 5 8 )<br>
( 1 2 4 5 8 ) → ( 1 2 4 5 8 )<br>