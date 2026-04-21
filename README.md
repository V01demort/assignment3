# Assignment 3: Sorting and Searching Algorithm Analysis System

## A. Project Overview
Selected algorithms:  
- **Bubble Sort** (Category A – Basic Sorting)  
- **Merge Sort** (Category B – Advanced Sorting)  
- **Linear Search** (Category C – Searching)  

The purpose of this experiment is to implement three required algorithms, measure their execution time using `System.nanoTime()`, compare performance on different array sizes (10, 100, 1000) and input types (random vs sorted), and analyze the results against theoretical Big-O complexity.

## B. Algorithm Descriptions

### Bubble Sort
Repeatedly steps through the array, compares adjacent elements and swaps them if they are in the wrong order. Each pass moves the largest element to its correct position.  
**Time complexity:** O(n²) (worst and average case)

### Merge Sort
Divide-and-conquer algorithm. Recursively divides the array into two halves, sorts them, and then merges the sorted halves.  
**Time complexity:** O(n log n) (all cases)

### Linear Search
Iterates through each element of the array sequentially until the target is found or the end is reached.  
**Time complexity:** O(n)

## C. Experimental Results

**Comparisons:**
- Merge Sort is significantly faster than Bubble Sort, especially as input size increases, due to better time complexity (O(n log n) vs O(n²)).
- The performance gap grows with larger arrays.
- Sorted input improves Bubble Sort performance (fewer swaps), while Merge Sort is mostly unaffected by input order; small variations are likely measurement noise.
- Linear Search scales linearly (O(n)); faster results on sorted arrays are due to the target element’s position, not the sorting itself.

## D. Screenshots
### Execution Times (sample run on Java)

<img width="693" height="828" alt="image" src="https://github.com/user-attachments/assets/b0591a94-8e07-4559-9e82-121ed3337000" />

## E. Reflection
During this assignment I learned that theoretical Big-O complexity perfectly matches real behavior: Merge Sort consistently outperforms Bubble Sort as array size increases, while Linear Search remains the simplest but least efficient searching method for large data.  

In practice, constant factors and overhead matter on very small arrays (n ≤ 100), but the asymptotic difference becomes dramatic at n = 1000. The main challenge was implementing the Merge Sort merge step correctly without extra space issues and ensuring all measurements used a fresh copy of the array to avoid side effects. Overall, the project strengthened my understanding of algorithm efficiency and clean OOP design.

---
**Repository structure** and commit history follow the assignment requirements.
```
