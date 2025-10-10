class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int [] dp = new int[energy.length];
        for(int i=energy.length-1;i>=0;i--){
            if(i+k<=energy.length-1){
                dp[i] = energy[i] + dp[i+k];
            }else{
                dp[i] = energy[i];
            }
        }
    int max = Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
