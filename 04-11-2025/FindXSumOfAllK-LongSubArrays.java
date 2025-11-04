class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
       int [] res = new int [n-k+1];
       for(int i=0;i<=n-k;i++){
        Map<Integer,Integer> mp = new HashMap<>();
        for (int j = i; j < i + k; j++) {
                mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b)->{
        if(!a.getValue().equals(b.getValue())){
            return (b.getValue() - a.getValue());
        }else{
            return (b.getKey() - a.getKey());
        }}
        );
        Set<Integer> st = new HashSet<>();
        for(int j=0;j<Math.min(x,list.size());j++){
            st.add(list.get(j).getKey());
        }
        int sum = 0;
        for(int m=i;m<i+k;m++){
            if(st.contains(nums[m])){
                sum += nums[m];
            }
        }
        res[i] = sum;
       } 
       return res;
    }
}
