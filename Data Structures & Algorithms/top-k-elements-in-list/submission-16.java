class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> frequency = new HashMap<>();

        for(int i=0;i<nums.length;i++){   
        frequency.put(nums[i],frequency.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>(
         Comparator.comparingInt(Map.Entry :: getValue)

        );

        for(Map.Entry<Integer,Integer> e : frequency.entrySet()){

           pq.offer(e);
           if(pq.size()>k){
            pq.poll();
           }


        }

        int result[] = new int[k];
        for(int i=0;i<k;i++){
            
            result[i]=pq.poll().getKey();
        }
        return result;
    }
}
