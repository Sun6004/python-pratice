from random import random

 # 홀짝을 입력하시오: 홀
 # 나 : 홀
 # 컴 : ?
 # 결과: 승리/패배/무승부
 
a = input("홀짝을 입력하시오: ");
print("나: "+a)

rand = random()

if rand < 0.5:
    com = "홀"
else:
    com = "짝"

print("컴: " + com)

res = ""

if com == a:
    res = "승리"
else:
    
    res = "패배"

print("결과: " + res)    

print("바보", end="\n")
print("천재")
