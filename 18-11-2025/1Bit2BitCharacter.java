class Solution {
    public boolean isOneBitCharacter(int[] bits) {
    //    if(bits.length %2 == 0){
    //     return false;
    //    } 
    //    return true;
    int i = 0;
    int n = bits.length;
    while(i < n-1){
        if(bits[i] == 1){
            i = i+2;
        }else{
            i = i+1;
        }
    }
    return i == n-1;
    }
}
