# Assignment 3: Sorting and Searching Algorithm Analysis System

## Project Overview

This Java project compares sorting and searching algorithms.

Selected algorithms:

- Basic Sorting: Selection Sort
- Advanced Sorting: Merge Sort
- Searching: Binary Search

The program tests different array sizes and measures time using `System.nanoTime()`.

## Algorithms

### Selection Sort

Selection Sort finds the smallest element and puts it in the correct position.

Time complexity:

- Best: O(n²)
- Average: O(n²)
- Worst: O(n²)

### Merge Sort

Merge Sort divides the array into two parts, sorts them, and merges them back.

Time complexity:

- Best: O(n log n)
- Average: O(n log n)
- Worst: O(n log n)

### Binary Search

Binary Search checks the middle of a sorted array and removes half of the search area each step.

Time complexity:

- Best: O(1)
- Average: O(log n)
- Worst: O(log n)

## Results

The program tests:

- Small array: 10 elements
- Medium array: 100 elements
- Large array: 1000 elements
- Random arrays
- Sorted arrays

Example table:

| Size | Input Type | Selection Sort | Merge Sort | Binary Search |
|---|---|---:|---:|---:|
| 10 | Random | depends on run | depends on run | depends on run |
| 100 | Random | depends on run | depends on run | depends on run |
| 1000 | Random | depends on run | depends on run | depends on run |

The time can be different every run because it depends on the computer.

## Analysis

Merge Sort is usually faster than Selection Sort on large arrays. Selection Sort has O(n²), so it becomes slow when the array size increases. Merge Sort has O(n log n), so it works better with large data.

Sorted and random arrays can give different times. However, Selection Sort still checks many elements even if the array is already sorted. Merge Sort also still divides and merges the array.

Binary Search is very fast because it does not check every element. It cuts the search area in half every step.

Binary Search needs a sorted array. If the array is not sorted, the algorithm cannot know which side to search.

## Reflection

I learned that simple algorithms are easy to write, but they can be slow. Advanced algorithms are harder, but they work better with large arrays.

I also learned how to measure execution time in Java and compare algorithms in practice.

## How to Run

```bash
javac src/*.java
java -cp src Main
```

## Repository Structure

```text
assignment3-sorting-searching/
├── src/
│   ├── Sorter.java
│   ├── Searcher.java
│   ├── Experiment.java
│   └── Main.java
├── docs/
│   └── screenshots/
├── README.md
└── .gitignore
```