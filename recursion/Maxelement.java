public class Maxelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,43,21,23};

        System.out.print("Max element is:" + max(arr.length - 1 , arr));
        System.out.println();
        System.out.print("sum of elements : " + sum(arr,arr.length-1));
    }
    static int max(int n, int[] arr){
        
        //base case
        if(n == 0) return arr[0];

        //recursive work
        int smallmax = max(n - 1,arr);
        
        //self work

        return Math.max(arr[n] , smallmax);
        
    }
    static int sum(int[] arr, int n){
        //base caes
        if(n == 0) return arr[0];

        // recursive work + stepwork

        return arr[n] + sum(arr,n-1);
        
    }
    
}
