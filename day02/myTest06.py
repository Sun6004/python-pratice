#가위 바위 보 게임
from random import random

user = input("가위 바위 보를 선택하세요: ")
print("유저: "+user)

rand = random()

if rand < 0.33:
    com = "가위"
elif rand <0.66:
    com = "바위"
else:
    com = "보"

print("컴퓨터: "+com)

res = ""

if com == user:
    res = "무승부"
elif com == "가위" and user == "보" :
    res = "컴퓨터 승리"
elif com == "바위" and user == "가위" :
    res = "컴퓨터 승리"
elif com == "보" and user == "바위" :
    res = "컴퓨터 승리"
else:
    res = "유저승리"

print("결과: "+ res)
