public class fibo {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++){
            System.out.print(fibo(i) + " ");
        }

        
    }
    private static int fibo(int n){
        
        if(n == 1 || n == 2) return 1;

        
        return fibo(n -1) + fibo(n - 2);
        
    }
}
