import java.util.*;
class sum_even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        
        if(n <= 0) System.out.println("Invalid input");
        for(int i = 0; i <= 2*n; i += 2){
            if(i != 0 && i % 2 == 0){
                sum += i;
                System.out.print(i + " ");
                
            }
            
        }
        System.out.println();
        System.out.println(sum);
    }
}