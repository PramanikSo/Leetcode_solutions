class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int val = 0;

        for (int bit : nums) {
            val = ((val << 1) + bit) % 5; // val = (val*2 + bit) % 5
            result.add(val == 0);
        }

        return result;
    }
}