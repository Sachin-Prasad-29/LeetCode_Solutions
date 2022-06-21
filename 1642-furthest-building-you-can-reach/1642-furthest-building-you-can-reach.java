class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        int n = h.length;
        for(int i = 0 ; i < n-1 ; i++){
            int diff = h[i+1]- h[i];
            if(diff > 0){
                min_heap.offer(diff);
                if(min_heap.size() > l){
                    b = b - min_heap.poll();
                    if(b < 0 ) return i;
                }
            }
        }
        return n-1;
    }
}