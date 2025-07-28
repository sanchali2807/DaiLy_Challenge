class Solution {
    public int countHillValley(int[] nums) {
      int n = nums.length;
      int count = 0;
      int [] res = new int[n];
      int j = 0;
      res[j++] = nums[0];
      for(int i = 1 ;i < n ; i++ ){
        if(nums[i] != nums[i-1]){
            res[j++] = nums[i];
        }
      }  
      
    for(int i = 1 ;i < j-1 ;i++){
        if((res[i] > res[i-1] && res[i] > res[i+1])||(res[i] < res[i-1] && res[i] < res[i+1])){
            count++;
        }
    }
    return count;
    }
}
