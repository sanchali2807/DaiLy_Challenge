class Solution {
    public int gcd(int i,int j){
        if(j==0)return i;
        return gcd(j,i%j);
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                count++;
            }
        }
       if(count>0){
        return n - count;
       }
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int g = nums[i];
            for(int j=i+1;j<n;j++){
                g = gcd(g,nums[j]);
                if(g==1){
                    minLen = Math.min(minLen,j-i+1);
                    break;
                }
            }
        }
    if(minLen == Integer.MAX_VALUE) return -1;
        return minLen-1 + n-1;
    }
}
