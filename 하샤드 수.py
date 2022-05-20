def solution(x):
    answer = False;
    y = 0;
    z = x;
    while z > 0:
        y += z % 10;
        z= int(z / 10);
    
    
    if x % y == 0:
        answer = True;
        
    return answer
