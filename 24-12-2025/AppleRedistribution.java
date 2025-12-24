class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        int count=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int val=0;
        for(int i=capacity.length-1;i>=0;i--){
            val = val + capacity[i];
            count++;
            if(val>=sum){
                return count;
            }
        }
        return count;
    }
}
