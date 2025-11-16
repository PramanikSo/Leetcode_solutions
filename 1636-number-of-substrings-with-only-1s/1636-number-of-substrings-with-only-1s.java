class Solution {
    public int numSub(String s) {
        long count = 0;   // length of current streak of 1s
        long res = 0;
        long mod = 1_000_000_007;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            } else {
                res = (res + (count * (count + 1) / 2)) % mod;
                count = 0;
            }
        }

        // Add the last streak if remaining
        res = (res + (count * (count + 1) / 2)) % mod;

        return (int) res;
    }
}