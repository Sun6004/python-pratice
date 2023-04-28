import sys

from PyQt5 import uic
from PyQt5.QtWidgets import *
from random import random
from numba.parfors.array_analysis import random_calls


form_class = uic.loadUiType("qt05.ui")[0]

class WindowClass(QMainWindow, form_class) :
        #초기화 메서드
    def __init__(self) :
        super().__init__()
        self.setupUi(self)
        self.btn.clicked.connect(self.myclick)
        #self.t1.returnPressed.connect(self.myclick)
        
    def myclick(self):
        # l = QLabel("ss",self) 호출해서 사용하면 명령어 자동완성 나옴
        
        arr = [1,2,3,4,5,6,7,8,9,10,
               11,12,13,14,15,16,17,18,19,20,
               21,22,23,24,25,26,27,28,29,30,
               31,32,33,34,35,36,37,38,39,40,
               41,42,43,44,45]
      
        for i in range(1000):
            rnd = int(random() * 45)        
            a = arr[0]
            b = arr[rnd]
            arr[0] = b
            arr[rnd] = a
        
        self.t1.setText(str(arr[0]))
        self.t2.setText(str(arr[1]))
        self.t3.setText(str(arr[2]))
        self.t4.setText(str(arr[3]))
        self.t5.setText(str(arr[4]))
        self.t6.setText(str(arr[5]))
        
if __name__ == "__main__" :
    #QApplication : 프로그램을 실행시켜주는 클래스
    app = QApplication(sys.argv) 

    #WindowClass의 인스턴스 생성
    myWindow = WindowClass() 

    #프로그램 화면을 보여주는 코드
    myWindow.show()

    #프로그램을 이벤트루프로 진입시키는(프로그램을 작동시키는) 코드
    app.exec_()
    