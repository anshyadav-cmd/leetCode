
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] characters = new int[128];

        int left = 0, right = 0;
        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            characters[r]++;
            while(characters[r] > 1) {
                char l = s.charAt(left);
                characters[l]--;
                left++;
            }
            res = Math.max(res , right - left +1);
            right++;
        }
        return res;
    }
}