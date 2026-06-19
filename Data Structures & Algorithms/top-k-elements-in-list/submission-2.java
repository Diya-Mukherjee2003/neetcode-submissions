class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer>mpp=new HashMap<>();
       for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
       }
       PriorityQueue<int[]> pq=new PriorityQueue<>(
        (a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]
       );
       for(Map.Entry<Integer,Integer>entry:mpp.entrySet()){
        pq.add(new int[]{entry.getValue(),entry.getKey()});
        if(pq.size()>k){
            pq.poll();
        }
       }
       int[] ans=new int[k];
       int i=0;
       while(!pq.isEmpty() && i<k){
        ans[i]=pq.poll()[1];
        i++;
       }
       return ans;
    }
}
