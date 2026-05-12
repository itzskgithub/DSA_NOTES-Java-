public class fact {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    private static int fact(int n){
        if(n == 1) return 1;
        int product = n * fact(n -1);
        return product;
    }
}
