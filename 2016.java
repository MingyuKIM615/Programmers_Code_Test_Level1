class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] mon = {31,29,31,30,31,30,31,31,30,31,30,31};
        int total= 0;
        for(int i=0;i<a-1;i++){
            total += mon[i];
        }
        answer = week[((total+b)%7)-1];
        return answer;
    }
}
