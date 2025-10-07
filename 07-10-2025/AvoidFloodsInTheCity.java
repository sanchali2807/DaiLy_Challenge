class Solution {
    public int[] avoidFlood(int[] rains) {
        Map<Integer,Integer> lastRain = new HashMap<>();
        List<Integer> sunnyDays = new ArrayList<>();
        int [] ans = new int [rains.length];
        Arrays.fill(ans, -1);
        for(int i=0;i<rains.length;i++){
        boolean dried = false;
                if(rains[i] == 0){
                    sunnyDays.add(i);
                    ans[i]=1;
                }else{
                    if(lastRain.containsKey(rains[i])){
                        int prevIdx = lastRain.get(rains[i]);
                        for(int j=0;j<sunnyDays.size();j++){
                            if(prevIdx < sunnyDays.get(j)){
                                ans[sunnyDays.get(j)] = rains[i];
                                sunnyDays.remove(j);
                                dried = true;
                                break;
                            }
                        }
                        if(!dried){
                            return new int[0];
                        }
                    }
                    lastRain.put(rains[i],i);
                    ans[i] = -1;
                }
            
            }
        
return ans;
    }
}
