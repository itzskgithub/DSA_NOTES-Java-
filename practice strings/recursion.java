import java.util.*;
public class recursion {
    void funct1(int n){
            n = 1;
            funct2(n);
            System.out.println(n);
        }
        void funct2(int n){
            n = 2;
            funct3(n);
            System.out.println(n);
        }
        void funct3(int n){
            n = 5;
            System.out.println(n);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        recursion obj = new recursion();
        obj.funct1(n);

    }
}
