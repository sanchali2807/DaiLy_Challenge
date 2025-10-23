class Solution {
    public int sumDigit(int a, int b) {
        return (a + b) % 10;
    }

    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder newNum = new StringBuilder();

            for (int i = 1; i < s.length(); i++) {
                int a = s.charAt(i - 1) - '0';
                int b = s.charAt(i) - '0';
                newNum.append(sumDigit(a, b));
            }

            s = newNum.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }}
