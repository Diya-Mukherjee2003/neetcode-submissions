class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mpp=new HashMap<>();
        for(String s:strs){
            char[] cAr=s.toCharArray();
            Arrays.sort(cAr);
            String newStr=new String(cAr);
            mpp.putIfAbsent(newStr,new ArrayList<>());
            mpp.get(newStr).add(s);
        }
        return new ArrayList<>(mpp.values());
        
    }
}
