class Solution {
    public int maxProfit(int[] a) {
      int profit=0;
      for(int i=1;i<a.length;i++){
           if(a[i]>a[i-1]){
            profit += (a[i]-a[i-1]);
           }
      } 
      return profit; 
    }
}