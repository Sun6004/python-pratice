from random import random
def getHolljjak():
    rd = random()
    res = ""
    if rd < 0.5:
        res =  "홀"
    else:
        res = "짝"
        
    return res

com = getHolljjak()
print("com", com)