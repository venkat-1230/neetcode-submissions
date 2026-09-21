class Solution {
    public boolean isAnagram(String s, String t) {
        // int[] arr=new int[26];
        // boolean condition =true;
        // for(int i = 0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     arr[c-'a']++;
        // }
        // for(int i = 0;i<t.length();i++){
        //     char c=t.charAt(i);
        //     arr[c-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]!=0){
        //         return false;
        //     }
        // }
        // return true;
        // HashMap<Character,Integer> hmp=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     hmp.put(s.charAt(i),hmp.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0;i<t.length();i++){
        //     if(hmp.containsKey(t.charAt(i))){
        //         hmp.put(t.charAt(i), hmp.get(t.charAt(i)) - 1);
        //     }
        //     else{
        //         hmp.put(t.charAt(i),hmp.getOrDefault(t.charAt(i),0)+1);
        //     }
        // }
        // for(Map.Entry<Character,Integer> e:hmp.entrySet()){
        //     if(e.getValue()!=0){
        //         return false;
        //     }
        // }
        // return true;
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0) return false;
            map.put(ch, map.get(ch) -1);
        }
        return true;

    }
}
