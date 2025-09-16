class Solution {
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;  
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty()) {
                int top = stack.peek();
                int g = gcd(top, num);
                if (g == 1) break; 
                num = lcm(top, num); 
                stack.pop();
            }
            stack.push(num);
        }
        return new ArrayList<>(stack);
    }
}
