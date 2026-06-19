class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int val : nums)
            mp.put(val, mp.getOrDefault(val, 0) + 1);

        // Min-heap to keep track of top k frequent elements
        // {frequency, element}
        PriorityQueue<int[]> pq = new PriorityQueue<>
                       ((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            // Push the current element and its frequency
            // into heap
            pq.add(new int[] { entry.getValue(), entry.getKey() });

            // If heap size exceeds k,
            // remove the element with smallest frequency
            if (pq.size() > k)
                pq.poll();
        }

        // Extract elements from heap in descending
        // frequency order
        int[] res = new int[k];
        int i=0;
        while (!pq.isEmpty() && i<k) {
            res[i]=pq.poll()[1];
            i++;
        }
        return res;
    }
}
