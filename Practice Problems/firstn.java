public class firstn {
    public static void main(String[] args) {
        System.out.println("Sum :" + sum(5));
    }
    private static int sum(int n){
        if(n == 1) return 1;

        int sum = n + sum(n - 1);

        return sum;
    }
}
