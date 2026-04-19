public class print{
    public static void main(String[] args) {
        print obj = new print();
        obj.printtoN(10);
    }
    void printtoN(int n){
        if(n == 0) return;
        printtoN(n - 1);
        System.out.println(n + " ");
    }
}