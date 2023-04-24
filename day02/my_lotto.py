#1~ 45 까지의 중복없는 6자리 숫자
import random
num = []
while len(num) < 6 :
    a = random.randint(1,45+1)
    if a not in num:
        num.append(a)
        
print(num)

