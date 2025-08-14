class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i <= n-3 ; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
               String newStr = num.substring(i,i+3);
            if(newStr.compareTo(str.toString())>0) {
                str.setLength(0);
                str.append(newStr);
            }
            }
            
        }
    return str.toString();
    }
}
