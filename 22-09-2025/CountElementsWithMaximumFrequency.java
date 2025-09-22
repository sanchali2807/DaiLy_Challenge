class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int freq : mp.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int total = 0;
        for (int freq : mp.values()) {
            if (freq == maxFreq) {
                total += freq;
            }
        }

        return total;
    }
}
