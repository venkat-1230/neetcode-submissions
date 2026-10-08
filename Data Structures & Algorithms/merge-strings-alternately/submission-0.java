class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=0;
        int len2=0;
        int k=0;
        char[] arr= new char[word1.length()+word2.length()];
        while (len1<word1.length()||len2<word2.length()){
            if (len1< word1.length()) {
                arr[k] = word1.charAt(len1);
                len1++;
                k++;
            }
            if (len2 <word2.length()) {
                arr[k]=word2.charAt(len2);
                len2++;
                k++;
            }
        }
        return new String(arr);
    }
}