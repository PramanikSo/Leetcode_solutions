class Solution {
    public boolean isOneBitCharacter(int[] bits) {
         int n = bits.length;
        int i = 0;

        while (i < n - 1) {  // stop before last bit
            if (bits[i] == 1) {
                // 2-bit character: skip next bit as well
                i += 2;
            } else {
                // 1-bit character
                i += 1;
            }
        }

        // if we ended exactly at the last index, it's a single 0
        return i == n - 1;
    }
}