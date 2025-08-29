class Solution {
    public long flowerGame(int n, int m) {
        // if((n+m)% 2 ==0)return 0;
        int oddN = (n+1)/2;
        int evenN = (n/2);
        int oddM = (m + 1)/2;
        int evenM = m/2;

        long winningPairs = (long)oddN * evenM + (long)evenN * oddM;
        return winningPairs;
    }
}
