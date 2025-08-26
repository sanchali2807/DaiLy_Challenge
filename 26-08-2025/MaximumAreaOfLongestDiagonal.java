class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int maxArea = 0;
        for(int i=0;i<dimensions.length;i++){
            int l = dimensions[i][0];
            int r = dimensions[i][1];
            double len = Math.sqrt((l*l)+(r*r));
            int area = l*r;
            if(len > max){
                max = len;
                maxArea = area;
            }else if(len == max && area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
