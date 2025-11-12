class Solution {
    int solve(int[] coins,int amt)
    {
    if(amt==0)
    return amt;
    if(amt<0)
    {
        return Integer.MAX_VALUE;
    }
    int ans=Integer.MAX_VALUE;
    for(int i=0;i<coins.length;i++)
    {
       int pick=solve(coins,amt-coins[i]);
       if(pick!=Integer.MAX_VALUE)
       {
        ans=Math.min(pick+1,ans);
       }
    }
    return ans;
    }
      int solvebymem(int[] coins,int amt,int []dp)
    {
    if(amt==0)
    return amt;
    if(amt<0)
    {
        return Integer.MAX_VALUE;
    }
    if(dp[amt]!=-1)
    return dp[amt];
    int ans=Integer.MAX_VALUE;
    for(int i=0;i<coins.length;i++)
    {
       int pick=solvebymem(coins,amt-coins[i],dp);
       if(pick!=Integer.MAX_VALUE)
       {
        ans=Math.min(pick+1,ans);
       }
    }
    return dp[amt]=ans;
    }
    public int coinChange(int[] coins, int amt) {
        
        int []dp=new int[amt+1];
        Arrays.fill(dp,-1);
         int ans= solvebymem(coins,amt,dp);
        if(ans==Integer.MAX_VALUE)
        return -1;
        return ans;
    }
}