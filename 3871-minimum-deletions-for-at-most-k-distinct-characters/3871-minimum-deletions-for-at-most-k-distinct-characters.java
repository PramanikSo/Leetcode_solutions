class Solution {
    public int minDeletion(String s, int k) {
        int[] counter = new int[26];
        int cnt = 0;
        for (char c : s.toCharArray()) {
            counter[c-'a']++;
            if (counter[c-'a'] == 1) {
                ++cnt;
            }
        }
        Arrays.sort(counter);
        int i = 0;
        int ans = 0;
        while (cnt > k) {
            while (i < 26 && counter[i] == 0) {
                ++i;
            }
            ans += counter[i++];
            --cnt;
        }
        return ans;
    }
}