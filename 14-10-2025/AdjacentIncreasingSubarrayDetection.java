class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for(int i=0;i<n-2*k+1;i++){
            boolean firstIncr = true;
            for(int j=i;j<i+k-1;j++){
                if(nums.get(j) >= nums.get(j+1)){
                    firstIncr = false;
                    break;
                }
            }
            if(firstIncr){
                boolean secondIncr = true;
                for(int j=i+k;j<i+2*k-1;j++){
                    if(nums.get(j) >= nums.get(j+1)){
                        secondIncr = false;
                        break;
                    }
                }
        if(secondIncr)return true;
            }
        }
        return false;
    }
}
