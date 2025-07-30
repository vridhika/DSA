class Solution {
    public int[] sortedSquares(int[] nums) {
        int a=0;
        int b=nums.length-1;
        int[] res=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
           if (Math.abs(nums[a]) > Math.abs(nums[b])) {

                res[i]=nums[a]*nums[a];
                 a++;
            }
           
        
        else{
            res[i]=nums[b]*nums[b];
            b--;
        }
    }
    return res;
}
}