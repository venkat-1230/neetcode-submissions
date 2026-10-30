class Solution {
    public int characterReplacement(String s, int k) {
        int[] f = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i) - 'A']++;
            maxfreq = Math.max(
                maxfreq,
                f[s.charAt(i) - 'A']
            );
            while ((i - left + 1) - maxfreq > k) {
                f[s.charAt(left) - 'A']--;
                left++;
            }
            maxlength = Math.max(
                maxlength,
                i - left + 1
            );
        }
        return maxlength;
    }
}