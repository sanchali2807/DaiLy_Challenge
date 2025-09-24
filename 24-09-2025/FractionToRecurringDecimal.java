class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder str = new StringBuilder();
        Map<Long, Integer> mp = new HashMap<>();

        if ((numerator < 0) ^ (denominator < 0)) str.append("-");

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        long rem = num % den;

        str.append(num / den); 
        if (rem != 0) str.append(".");

        while (rem != 0) {
            if (mp.containsKey(rem)) {
                int pos = mp.get(rem);
                str.insert(pos, "(");
                str.append(")");
                break;
            }

            mp.put(rem, str.length()); 

            rem *= 10;
            long digit = rem / den;
            str.append(digit);

            rem %= den;
        }

        return str.toString();
    }
}
