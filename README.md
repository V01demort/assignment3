# Assignment 3: Sorting and Searching Algorithm Analysis System

## A. Project Overview
Selected algorithms:  
- **Bubble Sort** (Category A – Basic Sorting)  
- **Merge Sort** (Category B – Advanced Sorting)  
- **Linear Search** (Category C – Searching)  

The purpose of this experiment is to implement the required algorithms, measure their execution time using `System.nanoTime()`, compare performance on different array sizes (10, 100, 1000) and input types (random vs sorted), and analyze the results in relation to theoretical Big-O complexity.

---

## B. Algorithm Descriptions

### Bubble Sort
Repeatedly steps through the array, compares adjacent elements and swaps them if they are in the wrong order. Each pass moves the largest element to its correct position.  
**Time complexity:** O(n²) (worst and average case), O(n) (best case for sorted input)

### Merge Sort
A divide-and-conquer algorithm that recursively splits the array into halves, sorts them, and merges the results.  
**Time complexity:** O(n log n) (all cases)

### Linear Search
Iterates through each element of the array sequentially until the target is found or the end is reached.  
**Time complexity:** O(n)

---

## C. Experimental Results

**Comparisons:**
- Merge Sort is significantly faster than Bubble Sort for larger inputs due to its better time complexity (O(n log n) vs O(n²)).  
- The performance gap increases as the input size grows.  
- Sorted input improves Bubble Sort performance (fewer swaps), while Merge Sort is largely unaffected by input order; minor differences are likely due to measurement noise.  
- Linear Search scales linearly (O(n)); faster results on sorted arrays are caused by the target element’s position, not the sorting itself.  

---

## D. Screenshots
### Execution Times (sample run on Java)

![Execution Results](https://github.com/user-attachments/assets/b0591a94-8e07-4559-9e82-121ed3337000)

---

## E. Reflection
This assignment demonstrated how theoretical Big-O complexity aligns with practical performance: Merge Sort consistently outperforms Bubble Sort as input size increases, while Linear Search remains simple but inefficient for large datasets.  

For small arrays (n ≤ 100), constant factors and overhead can influence results, but for larger inputs (n = 1000), asymptotic behavior becomes dominant. One of the main challenges was implementing the merge step correctly and ensuring fair benchmarking by using fresh copies of arrays for each test.  

Overall, the project improved understanding of algorithm efficiency and reinforced good programming practices.
