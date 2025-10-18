class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        long isAvailable = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            long leftRange = (long)nums[i] - k;
            long rightRange = (long)nums[i] + k;
            long assign = Math.max(leftRange,isAvailable);
            if(assign<= rightRange ){
            count++;
            isAvailable = assign+1;
            }

        }
        return count;
    }
}
