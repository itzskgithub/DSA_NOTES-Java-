public class printNtimes {
    public static void main(String[] args) {
        printNtimesword(5);
    }
    static void printNtimesword(int n){
        if(n == 0) return;
        System.out.println("Shubham");
        printNtimesword(n-1);
    }
}
