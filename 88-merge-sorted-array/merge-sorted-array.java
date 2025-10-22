class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0&&j>=0){
            if(A[i]>=B[j]){
                A[idx]=A[i];
                idx--;
                i--;
            }
            else{
                A[idx]=B[j];
                idx--;
                j--;
            }
        }
        while(j>=0){
            A[idx]=B[j];
            idx--;
            j--;
        }
    }
}