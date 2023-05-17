class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer>hashSet = new HashSet<Integer>();
        for(int num:nums){
           hashSet.add(num);
        }
        int longestConsecutive = 0;
        for(int num:nums){
            if(!hashSet.contains(num-1)){
                int curNum=num;
                int curConsecutive=1;
                
               while(hashSet.contains(curNum+1)){
                   curNum+=1 ;
                   curConsecutive+=1;
               }
                longestConsecutive= Math.max(longestConsecutive,curConsecutive );
            }
        }
        return longestConsecutive;
        
    }
}