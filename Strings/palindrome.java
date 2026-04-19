import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        int left = 0; 
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Not a palindrome");
                break;
            }
            else{
                left++;
                right--;
            }
            System.out.println("String is a Palindrome");
        }
        
    }
}