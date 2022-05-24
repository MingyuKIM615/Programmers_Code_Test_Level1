def solution(array, commands):
    answer = []
    
    for arr in commands:
        i = arr[0] - 1
        j = arr[1]
        k = arr[2] - 1
        
        new_array = []
        new_array.extend(array[i:j])
        new_array.sort()
        
        answer.append(new_array[k]) 
    
    return answer
