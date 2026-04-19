public class first_into_uppercase {
    public static void main(String[] args) {
        String str = "hi, i am shubham kumar pandey";
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == ' '){
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
            }
        }
        System.out.println(str);
        System.out.println(sb.toString());
    }
}
