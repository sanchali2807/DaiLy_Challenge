import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger n = new BigInteger(a, 2);  
        BigInteger m = new BigInteger(b, 2);

        while (!m.equals(BigInteger.ZERO)) {
            BigInteger carry = n.and(m).shiftLeft(1); 
            n = n.xor(m);                         
            m = carry;                                
        }

        return n.toString(2); 
    }
}
