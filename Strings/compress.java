public class compress {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        Integer count = 1;
        for(int i = 0; i<str.length() - 1; i++){
            while(i< str.length() -1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
                count = 1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbccdddeee";
        System.out.println(compress(str));
    }
}
