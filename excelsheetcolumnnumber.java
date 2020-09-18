//Java Solution

class Solution {
    public int titleToNumber(String s) {
        int p1 = s.length() - 1;
        int total = 0;
        int step = 0;
        
        while (p1 >= 0) {
            int val = s.charAt(p1--) - 'A' + 1;
            total += val * Math.pow(26, step++);
        }
        
        return total;
    }
}