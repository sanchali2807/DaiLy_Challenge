class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for(int k = n-1 ; k >=2 ; k--){
            int first = 0;
            int mid = k-1;
            while (first < mid) { 
            if(nums[first] + nums[mid] > nums[k]){
               count+=mid-first;
               mid--;
            }else{
                first++;
            }
        }}
        return count;
    }
}
