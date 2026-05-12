public class power {
    public static void main(String[] args) {
        System.out.println(power(5,3));
    }
    private static int power(int x,int n){
        if(n == 1) return x;

        int power = x * power(x,n-1);
        return power;
    }
}
