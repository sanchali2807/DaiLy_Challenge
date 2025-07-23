class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        int score = 0;
        if(x>y){
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(!st.isEmpty() && st.peek() == 'a' && ch == 'b'){
                    score += x;
                    st.pop();
                    }
                   else{
                st.push(ch);
                    }
            }
               Stack<Character> temp = new Stack<>();
            while (!st.isEmpty()) {
                char ch1 = st.pop();
                if (!temp.isEmpty() && temp.peek() == 'a' && ch1 == 'b') {
                    temp.pop();
                    score += y;
                } else {
                    temp.push(ch1);
                }
            }

        }
        else{
               for(int i=0;i<s.length();i++){
               char ch = s.charAt(i);
                if(!st.isEmpty() && st.peek() == 'b' && ch == 'a'){
                    score += y;
                    st.pop();
                    }else{
                st.push(ch);
                    }
            }
                Stack<Character> temp = new Stack<>();
            while (!st.isEmpty()) {
                char ch1 = st.pop();
                if (!temp.isEmpty() && temp.peek() == 'b' && ch1 == 'a') {
                    temp.pop();
                    score += x;
                } else {
                    temp.push(ch1);
                }
            }

        }
        
return score;
    }
}



