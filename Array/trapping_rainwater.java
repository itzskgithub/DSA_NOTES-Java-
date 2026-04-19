public class trapping_rainwater {
    public static int trap_water(int heights[] , int left_max[], int right_max[]){
        //water trapped in when the width is 1: (height of water - height of tower)

        // height of water is min(maxleft, maxright)

        int sum_of_water_trapped = 0;

        for(int i = 0; i < heights.length; i++){
            sum_of_water_trapped += (Math.min(left_max[i] , right_max[i]) - heights[i]);
        }
        return sum_of_water_trapped;
    }
    public static void main(String[] args) {
        int[] heights = {4,2,0,6,3,2,5};
        
        int[] left_max = new int[heights.length];
        int[] right_max = new int[heights.length];

        left_max[0] = heights[0];

        right_max[heights.length - 1] = heights[heights.length - 1];

        for(int i = 1; i<heights.length; i++){
            left_max[i] = Math.max(left_max[i-1] , heights[i]);
        }

        for(int i = heights.length - 2; i>=0; i--){
            right_max[i] = Math.max(right_max[i + 1] , heights[i]);
        }
        
        System.out.println("rainwater trapped is " + trap_water(heights, left_max, right_max));
    }
}
