public class Swapping {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+a+", b: "+b);
    }
}
