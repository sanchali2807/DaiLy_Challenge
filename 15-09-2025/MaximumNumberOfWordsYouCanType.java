class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        char [] ch = brokenLetters.toCharArray();
        String[] words = text.split(" ");
        int count = 0;
        for(int i=0;i<words.length;i++){
            String s = words[i];
            boolean flag = false;
            for(int j=0;j<s.length();j++){
                char a = s.charAt(j);
            for(char c : ch){
                if(c == a){
                    flag = true;
                    break;
                }
            }
            }
            if(flag==false){
                count++;
            }
        }
        return count;
    }
}
