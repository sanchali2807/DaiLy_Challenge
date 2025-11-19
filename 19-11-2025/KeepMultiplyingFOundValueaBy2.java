class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(nums[i]);
        }
        
            while(li.contains(original)){
                original = original * 2;
            }
        return original;
    }
}
