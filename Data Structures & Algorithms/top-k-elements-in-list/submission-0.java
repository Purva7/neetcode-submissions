class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> map.get(b)- map.get(a));
        int result[]= new int[k];
        if(nums  == null || nums.length == 0){
            return new int[]{};
        }

        for(Integer i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(Integer v:map.keySet()){
          pq.add(v);
        }
        for(int i=0; i<k; i++){
            result[i] = pq.poll();
        }
         return result;
    }
}
