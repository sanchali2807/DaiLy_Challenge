class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int inc [] = new int[n];
        inc[n-1] = 1;
        for(int i = n-2 ; i >= 0 ;i--){
            if(nums.get(i) < nums.get(i+1)){
                inc[i] = inc[i+1] + 1;
            }else{
                inc[i] = 1;
            }
        }
        int low = 1;
        int high = n/2;
        int answer = 0;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(canMake(inc,mid,n)){
                answer = mid;
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return answer;
    }
    public boolean canMake(int[] inc, int k,int n){
        for(int i=0;i + 2*k <= n ;i++){
            if(inc[i] >= k && inc[i+k] >=k){
                return true;
            }
        }
        return false;
    }
}
