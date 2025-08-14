class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int l = queries.length;
        List<Integer> powers = new ArrayList<>();
        int [] res = new int[l];
        int idx = 0;
        while(n!=0){
            int digit = n%2;
            if(digit == 1){
                powers.add((int)Math.pow(2,idx));
            }
            n = n/2;
            idx++;
        }
            int index = 0;
        for(int i=0;i<l;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            final int MOD = 1_000_000_007;
            long product = 1;
            for (int j = left; j <= right; j++) {
            product = (product * powers.get(j)) % MOD;
    }
            res[index++] = (int) product;

        }
        return res;
    }
}
