Selection sort correctness: 
Selection Sort works on choosing the highest and lowest element from the array's unsorted, and then placing it in the sorted. As the size of the unsorted reduces by one in every single iteration & the array consists of a finite no of elements, the selection sort algorithm will be terminated after finite steps.

After every iteration, the sorted portion of the array is sorted in ascending order.
Beginning, the portion that is sorted is empty known as "Base Case" and after the kth iteration (say), the first k elements are sorted in ascending order, and at the phase of (k+1) iteration: it selects the first smallest element from the unsorted and places at index position. Ensuring k+1 smallest element at k index's position and the first k sorted elements in ascending order shows us that the entire array will be sorted in ascending order.

Thus, we can say that Selection Sort is correct since it terminates after a finite number of steps and the whole unsorted array will be sorted in ascending array following both "Termination" and "Partial Correctness".
