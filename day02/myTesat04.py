#1~9 사이의 중복없는 3개의 숫자를 출력하시오
from random import random

arr = [1,2,3,4,5,6,7,8,9]

for i in range(100):
    rnd = int(random()*9)
    a = arr[rnd]
    b = arr[0]
    
    arr[0]=a
    arr[rnd]=b

print("{}, {}, {}".format(arr[0], arr[1], arr[2]))
    
    