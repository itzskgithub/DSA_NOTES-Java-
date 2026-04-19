import java.util.*;
public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed String : " + reversed);
    }
}
