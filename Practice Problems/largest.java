public class largest {
    public static void main(String[] args) {
        int num = 11223;
        System.out.println("Largest digit is: " + largest_digit(num));

    }
    public static int largest_digit(int num){
        int max = 0;
        while(num > 0){
            max = Math.max(max , num % 10);
            num /= 10;
        }
        return max;
    }
}
