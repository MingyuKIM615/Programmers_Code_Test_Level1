import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        char arr[] = new char[s.length()];
        for(int i =0; i<s.length();i++){
            arr[i] = s.charAt(i);
            
        }
        Arrays.sort(arr);
        System.out.print(arr);
        String revers = "";
        for(int i = s.length()-1;i>=0;i--){
            revers += arr[i];
        }
        answer = Long.parseLong(revers);
        
        return answer;
    }
}
