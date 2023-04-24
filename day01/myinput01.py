#a = input("좋아하는 과일을 넣으세요>>")
#print("당신이 좋아하는 과일은"+ a +"입니다.")

b = input("숫자를 입력하시오>>")
c = input("다음 숫자를 입력하시오>>")
sum = int(b) + int(c)
print(b+"와"+c+"의 합은"+ str(sum) +"입니다.")

print("{}와 {}의 합은 {}입니다.".format(b,c,sum))