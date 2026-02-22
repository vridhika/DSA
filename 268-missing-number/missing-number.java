class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actual=0;
        int sum=n*(n+1)/2;
        for(int num:nums){
            actual+=num;
        }
        return sum-actual;
    }
}