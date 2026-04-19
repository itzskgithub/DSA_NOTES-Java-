import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ehter a string: ");
        String str = sc.nextLine();
        String reversed = "";
        for(int i = str.length()-1; i >=0; i--){
            reversed = reversed + str.charAt(i);
        }
        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) != reversed.charAt(i)){
                System.out.println("String is not a palindrome");
            }
            break;
        }
        System.out.println("String is palindrome");  
    }
    
}
