class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i =0;i<nums.length;i++){
            int sum = 0;
            for(int j=i+1;j<nums.length;j++){
                for(int k = j+1; k<nums.length;k++){
                    int cnt = 0;
                    sum = nums[i] + nums[j] + nums[k];
                    for(int l = 1; l<=sum;l++){
                        if(sum%l == 0){
                            cnt += 1;
                        }
                        
                    }
                    if(cnt==2){
                        answer +=1;
                    }
                    }
                }
            }
             return answer;
        }
       
    }
