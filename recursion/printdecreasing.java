public class printdecreasing{
    public static void main(String[] args) {
        printdecreasing obj = new printdecreasing();
        obj.printfromN(10);
    }
    void printfromN(int n){
        if(n == 0) return;

        System.out.print(n + " ");
        printfromN(n - 1);
    }
}