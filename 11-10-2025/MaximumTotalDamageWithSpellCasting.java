class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> damage = new HashMap<>();
        for (int p : power) {
            damage.put(p, damage.getOrDefault(p, 0L) + p);
        }

        List<Integer> powers = new ArrayList<>(damage.keySet());
        Collections.sort(powers);

        Map<Integer, Long> dp = new HashMap<>();
        dp.put(0, 0L);

        for (int i = 0; i < powers.size(); i++) {
            int curr = powers.get(i);
            long take = damage.get(curr);

            
            int prevIndex = i - 1;
            long prevMax = 0;
            while (prevIndex >= 0 && powers.get(prevIndex) >= curr - 2) {
                prevIndex--;
            }
            if (prevIndex >= 0) prevMax = dp.get(powers.get(prevIndex));

            
            long skip = (i > 0) ? dp.get(powers.get(i - 1)) : 0;

            dp.put(curr, Math.max(skip, take + prevMax));
        }

        return dp.get(powers.get(powers.size() - 1));
    }
}
