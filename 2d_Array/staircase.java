//In this type of problem u are given a sorted 2d array in which all elements are sorted in such a way that rows and columns have accesending order or descending order values
/*      {10,20,30,40}
        {15,25,35,45}
        {27,29,37,48}
        {32,33,39,50}
*/  

// In this let we have to find 33 is present in the array or not so O(n2) time complexity will be taken from the brute force approach 

// The optimised way to solve this is staircase method in this method we traverse the elements from either toplast element(here 40) or bottomfirst element (here 32) in such a way that if we consider the element 40 then index value is (0 , m-1) and 32 index value is (n-1 , 0).

// So we check whether the key with the cell value is:
/*
        if(key < cell value){
            move left;
        }
        if(key > cell value){
            move bottom
        }

    This process continues until the  row < nums.length and col >= 0 in the case when we start traversong from 40  


    And if we start traversing from 32 then:

        if(key < cell value){
            move top;
        }
        if(key > cell value){
            move right;
        }

    Thsi process continues until the row >= 0 and col < nums[0].length
*/


public class staircase {

    public static boolean iskeypresent(int nums[][], int key){
        int row = 0;
        int col = nums[0].length - 1;
        
        while(row < nums.length && col >= 0){
            int cellvalue = nums[row][col];
            if(nums[row][col] == key){
                System.out.println("key is present at:" + "(" + row + "," + col + ")");
                return true;
            }
            else if(key < cellvalue){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key is not present");
        return false;
    }
    public static void main(String[] args) {
        int[][] nums =  {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        int key = 33;

        iskeypresent(nums,key);
    }
    
}
