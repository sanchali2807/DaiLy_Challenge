class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character> rows[] = new HashSet[n];
        HashSet<Character> col[] = new HashSet[n];
        HashSet<Character> boxes[] = new HashSet[n];
        for(int i=0;i<n;i++){
            rows[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int r = 0 ; r < n ; r++){
            for(int c = 0 ; c < n ; c++){
                char val = board[r][c];
                if(val == '.')continue;
                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);
                if(col[c].contains(val)){
                    return false;
                }
                col[c].add(val);
                int idx = (r/3 * 3) + c/3;
                if(boxes[idx].contains(val)){
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
    }
}
