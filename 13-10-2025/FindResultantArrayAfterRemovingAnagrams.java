class Solution {
    public List<String> removeAnagrams(String[] words) {
        int [] prevFreq = new int[26];
        List<String> result = new ArrayList<>();
        for(String word : words){
            int [] currFreq = new int [26];
            for(char c : word.toCharArray()){
                currFreq[c - 'a']++;
            }
            if(!Arrays.equals(prevFreq,currFreq)){
                result.add(word);
            }

            prevFreq = currFreq;
        }
        return result;
    }
}
