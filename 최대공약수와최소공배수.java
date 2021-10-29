class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int Max = Math.max(n,m);
        int min = Math.min(n,m);
        
        while(min>0){
            int temp = min;
            min = Max % min;
            Max = temp;
        }
        answer[0] = Max;
        answer[1] = n*m / answer[0];
        return answer;
    }
}
