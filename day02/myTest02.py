# 첫 수를 입력하시오. 5
# 끝 수를 입력하시오. 8
# 5~ 8까지 합은 26입니다.

num1 = int(input("첫 수를 입력하시오: "))
num2 = int(input("끝 수를 입력하시오: "))

res = 0
arr = list(range(num1,num2+1))
for i in arr:
    res += i 
print(str(num1)+"~"+ str(num2)+"까지의 합은 " + str(res) + "입니다.")
print("{}에서 {}까지의 합은 {}입니다.".format(num1,num2,res))