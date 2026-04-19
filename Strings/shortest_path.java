public class shortest_path {
    public static void main(String[] args) {
        String str = "WNEENESSNNN";
        int x_cord = 0;
        int y_cord = 0;
        double shortest_path = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'N'){
                y_cord++;
            }
            if(str.charAt(i) == 'S'){
                y_cord--;
            }
            if(str.charAt(i) == 'E'){
                x_cord++;
            }
            if(str.charAt(i) == 'W'){
                x_cord--;
            }
        }
        shortest_path = Math.sqrt(x_cord * x_cord + y_cord * y_cord);
        System.out.println("Shortest path for the string" + " " + str + " " + "is"  + " " + shortest_path);
    }
}
