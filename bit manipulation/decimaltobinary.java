import java.util.*;
public class decimaltobinary {
    public static String tobinary(int decimal){
        StringBuilder sb  = new StringBuilder();
        while(decimal > 0){
            sb.append(decimal % 2);
            decimal /= 2;
        }
        return sb.toString();
    }
    public static String reversebinary(String binary){
        char arr[] = binary.toCharArray();
        int right = arr.length - 1;
        int left = 0;
        char temp;
        while(left < right){
            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decinal value:");
        int decimal = sc.nextInt();
        String binary = tobinary(decimal);
        String result = reversebinary(binary);
        System.out.println("Binary:" + result);
    }
}
