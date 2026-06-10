class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int i =0;
        while(i<n){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)|| (s.charAt(i)>=48 && s.charAt(i)<=57)){
                str.append(s.charAt(i));
            }
            i++;
        }
        String stt = str.toString();
        stt = stt.toLowerCase();
        StringBuilder stp = new StringBuilder(stt);
        stp.reverse();
        String st = stp.toString();
        st = st.toLowerCase();
        if(stt.equals(st)) return true;
        else return false;
    }
}
