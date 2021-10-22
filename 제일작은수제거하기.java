class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        
        for(int i =0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }    
        }
        
        
        if(arr.length==1)
            return new int[]{-1};
        int cnt=0;    
        int[] answer = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min) continue;
            answer[cnt++] = arr[i];
        }
            return answer;
        
        
        
    }
}
