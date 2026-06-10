import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char [] ch = s.toCharArray();
        char [] arr = t.toCharArray();
        int x=0;
        Arrays.sort(ch);
        Arrays.sort(arr);
        if(ch.length!= arr.length) return false;
        for(int i =0;i<ch.length;i++){
            if(ch[i]!= arr[i]) x=1;
        }
        if(x==0) return true;
        else return false;

    }
}
