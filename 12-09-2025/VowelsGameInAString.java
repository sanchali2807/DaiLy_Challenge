class Solution {
    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public boolean doesAliceWin(String s) {
        int countVowel = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                countVowel++;
            }
        }
        if(countVowel == 0)return false;
        return true;
    }
}
