class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int x =st.pop();
                int y = st.pop();
                if(tokens[i].equals("+")) st.push(x+y);
                if(tokens[i].equals("-")) st.push(y-x);
                if(tokens[i].equals("*")) st.push(y*x);
                if(tokens[i].equals("/")) st.push(y/x);
            }
            else st.push(Integer.parseInt(tokens[i]));
        }
        return st.peek();
        
    }
}
