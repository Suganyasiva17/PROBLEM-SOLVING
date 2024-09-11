class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        long cost=0;
      // min heap-priority queue stores the value in ascending order
        PriorityQueue<Long> pq=new PriorityQueue<>();
        long sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        for(int i=0;i<n-1;i++){
            sum=pq.poll()+pq.poll();// poll returns the first value of the queue
            cost+=sum;
            pq.add(sum);
        }
        return cost;
    }
}
