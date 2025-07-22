class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int max = 0;
        int sum = 0;
        int start = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        int i = 0;
        while(i<n){
            if(!mp.containsKey(nums[i])){
                sum = sum + nums[i];
                mp.put(nums[i],i);
                
            }else{
                int index = mp.get(nums[i]);
                while(start<=index){
                    sum = sum - nums[start];
                    mp.remove(nums[start]);
                    start++;
                }
                sum += nums[i];
                mp.put(nums[i], i);

            }
            max = Math.max(sum,max);
            i++;
            
        }
        return max;
    }
}
