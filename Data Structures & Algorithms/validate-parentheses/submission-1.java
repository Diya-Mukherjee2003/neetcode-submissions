class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]=='('||str[i]=='{'||str[i]=='['){
                st.push(str[i]);
            }
            else{
                char ch=str[i];
                if(st.isEmpty()) return false;
                if((ch==')' && st.peek()!='(')||(ch=='}' && st.peek()!='{')||(ch==']' && st.peek()!='[')){
                    return false;
                }
                st.pop();
                
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
