# 출력할 단수를 입력하시오:  4
# 구구단 4단을 출력

a = input("출력할 단수를 입력하시오: ")
dan = int(a)
     
for i in range(1,9+1):
    print("{} X {} = {}".format(dan,i,dan*i))

            