class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = Integer.MAX_VALUE;
        int m = strs.length;
        for(int i =0;i<m;i++){
            n = Math.min(n,strs[i].length());
        }
        if(n==0) return "";
        StringBuilder s = new StringBuilder();
        for(int i =0;i<n;i++){
            int x =0;
            char ch = strs[0].charAt(i);
            for(int j =1;j<m;j++){
                if(ch != strs[j].charAt(i)){
                    x=1;
                    break;
                }
            }
            if(x==1) break;
            s.append(ch);

        }
        return s.toString();
    }
}
