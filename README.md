# quadratic-sorting
This repository contains implementations of three sorting algorithms: insertion, bubble, and selection sort. The program `TestEfficiency` outputs information used to compare the efficiency of these algorithms as measured by wall clock time.

All three of these algorithms have a quadratic O(n2) time complexity.

To get started with the code, download the repository and navigate to the working directory. Compile the code with `javac EfficiencyTest.java` and run with `java EfficiencyTest`. 

The program will output information about the sorting algorithms in the following format:
1. sorting algorithm
2. runtime
3. number elements
4. status

A sample output, shortened for brevity, looks like the following:
```
insertionsort	375 ms.		50000	[OK]
bubblesort	5632 ms.	50000	[OK]
selectionsort	660 ms.		50000	[OK]
----------------------------------------------------
insertionsort	1176 ms.	100000	[OK]
bubblesort	21894 ms.	100000	[OK]
selectionsort	2934 ms.	100000	[OK]
----------------------------------------------------
insertionsort	2770 ms.	150000	[OK]
bubblesort	38680 ms.	150000	[OK]
selectionsort	6236 ms.	150000	[OK]
----------------------------------------------------
```
This information is visualized in the graph efficiency_graph.png, which is made up of runtime data points from my machine.
