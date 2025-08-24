class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int r=0;
        int l=0;
        
        int count=0;
        int maxcount=0;
        int sum=0;
        for(int i=0;i<n;i++){
         sum += nums[i];
        }
        if(sum == n){
            return n-1;
        }
        while(r<n)
        {
           if(nums[r]==0 && count==0)
           {
            count++;
           }
           else if(nums[r]==0 && count==1)
           {
            r=r-1;
            maxcount=Math.max(maxcount,r-l);
            if(nums[l]==0)
            {
                count--;
            }
            l++;
           }
          r++;

        }
        maxcount = Math.max(maxcount, r - l - 1); 
        return maxcount;
    }
}
