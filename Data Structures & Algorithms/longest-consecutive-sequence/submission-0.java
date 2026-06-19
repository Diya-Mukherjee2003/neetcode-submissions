class Solution {
    boolean linear(int[] nums,int t){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t) return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int maxCnt=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int cnt=1;
            while(linear(nums,x+1)==true){
                x=x+1;
                cnt=cnt+1;
            }
            maxCnt=Math.max(maxCnt,cnt);
        }
        return maxCnt;
    }
}
