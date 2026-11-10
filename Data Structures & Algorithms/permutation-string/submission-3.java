class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(),n2=s2.length();
        if (n1 > n2) {
            return false;
        }
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for (int i = 0; i < n1; i++) 
            f1[s1.charAt(i) - 'a']++;
        for (int i = 0; i < n1; i++) 
            f2[s2.charAt(i) - 'a']++;
        if (Arrays.equals(f1, f2)) 
            return true;
        for (int right = n1; right < n2; right++) {
            f2[s2.charAt(right) - 'a']++;
            f2[s2.charAt(right - n1) - 'a']--;
            if (Arrays.equals(f1, f2)) {
                return true;
            }
        }
        return false;
    }
}
//time complexity O(n+m)           n length of the string 1 , m length of the string 2
//space complexity O(1)