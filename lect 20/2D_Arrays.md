📌 1. 2D Arrays in Java

A 2D array is essentially an array of arrays, used to represent tabular data (rows & columns).

Declaration
int[][] arr = new int[3][4];   // 3 rows, 4 columns


Rows = 3

Columns = 4

Default values = 0

Initialization
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

Accessing elements
arr[0][1]   // 2 (row 0, col 1)

Traversing
for(int i = 0; i < arr.length; i++) {          // row
    for(int j = 0; j < arr[i].length; j++) {   // column
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}


✅ Properties

Rectangular structure → each row has the same number of columns.

Stored in contiguous memory.

Useful for matrices, grids, board games, images, etc.

📌 2. Jagged Arrays (Ragged Arrays)

A Jagged Array is also a 2D array, but with different column sizes for each row.
In other words, it’s an array of arrays where each row can have a different length.

Declaration
int[][] jagged = new int[3][];   // 3 rows, but column size not fixed
jagged[0] = new int[2];          // row 0 → 2 elements
jagged[1] = new int[4];          // row 1 → 4 elements
jagged[2] = new int[3];          // row 2 → 3 elements

Initialization
int[][] jagged = {
    {1, 2},
    {3, 4, 5, 6},
    {7, 8, 9}
};

Traversing
for(int i = 0; i < jagged.length; i++) {
    for(int j = 0; j < jagged[i].length; j++) {
        System.out.print(jagged[i][j] + " ");
    }
    System.out.println();
}


✅ Properties

Each row can have a different size.

Saves memory if rows don’t need equal columns.

Very useful in real-world cases (e.g., storing marks of students where each student takes a different number of subjects).

📊 Comparison: 2D vs Jagged
Feature	2D Array	Jagged Array
Shape	Rectangular (same columns in each row)	Irregular (rows can have different column sizes)
Memory	Fixed, may waste memory	Efficient (only allocates needed columns)
Example Use	Matrix operations, chessboard	Student marks, variable-length records