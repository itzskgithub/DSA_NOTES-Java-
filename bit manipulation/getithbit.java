public class getithbit {
    public static void main(String[] args) {
        System.out.println("ith bit is:" + getithbit(10 , 3));
    }
    public static int getithbit(int num, int i){
        int bitmask = 1 << i;
        if((num & bitmask) == 0) return 0;
        else return 1;
    }
}
