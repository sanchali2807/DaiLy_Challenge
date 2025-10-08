class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int [] res = new int [spells.length];
        Arrays.fill(res,0);
            Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int st = 0;
            int end = potions.length-1;
            int idx = potions.length;
            while(st<=end){
                int mid = st + (end - st)/2;
                if((long) potions[mid] * spells[i] >= success){
                    idx = mid;
                    end = mid - 1;
                }else{
                    st = mid + 1;
                }
            }
            res[i] = potions.length - idx;
        }
        return res;
    }
}
