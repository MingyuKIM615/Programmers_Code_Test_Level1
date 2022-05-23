def solution(answers):
    answer = []
    
    p1 = [1,2,3,4,5]
    p2 = [2,1,2,3,2,4,2,5]
    p3 = [3,3,1,1,2,2,4,4,5,5]
    
    c1 = 0
    c2 = 0
    c3 = 0
    
    for i in range(len(answers)):
        s1 = i % 5
        s2 = i % 8
        s3 = i % 10
        
        
        if p1[s1] == answers[i]:
            c1 +=1;
        if p2[s2] == answers[i]:
            c2 +=1;
        if p3[s3] == answers[i]:
            c3 +=1;
    
    m = max(c1, c2, c3)
    
    if m == c1:
        answer.append(1)
    if m == c2:
        answer.append(2)
    if m == c3:
        answer.append(3)
    
    return answer
