class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=nums[0];
        for(int i:nums){
            if(i==candidate){
                count++;
            }
        
            else{
                count--;
                if(count==0){
                    candidate=i;
                    count++;
                }
            }
        }
        return candidate;
    }
}
