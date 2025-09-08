class Solution {
    public int[] getNoZeroIntegers(int n) {
        int [] arr = new int[2];

        for(int i = 1 ; i < n ; i++){
            int a = i;
            int b = n-i;
            if(a<=0 || b<=0){return new int[]{-1,-1};}
            else{
                arr[0] = a;
                arr[1] = b; 
            }
        }
        return arr;
    }
}
