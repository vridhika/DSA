class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> answer = new ArrayList<>();
        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }
            else{
                answer.add(prev);
                prev=intervals[i];
            }
        }
        answer.add(prev);
        return answer.toArray(new int[answer.size()][]);
    }
}