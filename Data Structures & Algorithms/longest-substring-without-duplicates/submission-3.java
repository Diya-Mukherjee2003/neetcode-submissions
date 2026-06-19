class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.equals("")) return 0;
        // int maxLen=Integer.MIN_VALUE;
        // int left=0;
        // HashSet<Character>st=new HashSet<>();
        // for(int right=0;right<s.length();right++){
        //     while(st.contains(s.charAt(right))){
        //         st.remove(s.charAt(left));
        //         left++;
        //     }
        //     st.add(s.charAt(right));
        //     maxLen=Math.max(maxLen,right-left+1);
        // }
        // return maxLen;
        if(s.equals("")) return 0;
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int maxLen=Integer.MIN_VALUE;
        int l=0,r=0;
        HashSet<Character>st=new HashSet<>();
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            maxLen=Math.max(maxLen,r-l+1);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxLen;
    }
    
}
