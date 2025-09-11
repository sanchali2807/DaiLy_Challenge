class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            return true;
        }
        return false;
    }
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        StringBuilder str = new StringBuilder();
        int idx = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                str.append(vowels.get(idx));
                idx++;
            }else{
                str.append(ch);
            }
            
            }
            return str.toString();
    }
}
