class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCnt=0;
        int cnt=0,prev=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==prev){
                cnt++;
                prev=nums[i];
            }
           else if(nums[i]!=prev){
                prev=nums[i];
                cnt=1;
            }
            maxCnt=Math.max(maxCnt,cnt);
        }
        return maxCnt;
    }
}
