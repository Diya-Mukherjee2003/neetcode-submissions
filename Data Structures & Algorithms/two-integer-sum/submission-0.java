class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer>mpp=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(mpp.containsKey(res)){
                // return {mpp.get(res),i};
                arr[0]=mpp.get(res);
                arr[1]=i;
            }
            mpp.put(nums[i],i);
        }
        return arr;
    }
}
