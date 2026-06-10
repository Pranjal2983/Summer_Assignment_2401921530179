class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ch = ransomNote.toCharArray();
        char [] chh =magazine.toCharArray();
        int [] freq = new int[26];
        int [] freq2 = new int[26];
        for(int i=0;i<ch.length;i++){
            freq[ch[i]-'a']++;
        }
        for(int i=0;i<chh.length;i++){
            freq2[chh[i]-'a']++;
        }
        for(int i =0;i<26;i++){
            if(freq2[i]<freq[i]) return false;
        }
        return true;
    }
}
