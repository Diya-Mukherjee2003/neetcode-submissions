class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        // int[] pre=new int[nums.length];
        // int[] suf=new int[nums.length];
        // pre[0]=1;/
        ans[0]=1;
        for(int i=1;i<ans.length;i++){
            // pre[i]=pre[i-1]*nums[i-1];
            ans[i]=ans[i-1]*nums[i-1];
        }
        // suf[nums.length-1]=1;
        // for(int i=nums.length-2;i>=0;i--){
        //     suf[i]=suf[i+1]*nums[i+1];
        // }
        int suf=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i]*suf;
            suf*=nums[i];
        }
        return ans;
    }
}  
