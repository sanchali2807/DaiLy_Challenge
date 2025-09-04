class Solution {
    public int findClosest(int x, int y, int z) {
        int diffX = Math.abs(z-x);
        int diffY = Math.abs(z-y);
        if(diffX == diffY)return 0;

        int res = Math.min(diffX,diffY);
        

        return (res == diffX ? 1 : 2);
    }
}
