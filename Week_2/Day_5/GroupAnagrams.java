class Solution {
    public String convert(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<arr.length;i++) sb.append(arr[i]);
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String d = convert(strs[i]);
            List<String> a =new ArrayList<>();
            a.add(strs[i]);
            if(map.containsKey(d)) map.get(d).add(strs[i]);
            else map.put(d,a);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String ele : map.keySet()){
            ans.add(map.get(ele));
        }
        return ans;
    }
}
