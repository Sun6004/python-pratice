import sys
from PyQt5 import uic
from PyQt5.QtWidgets import *
from random import random

form_class = uic.loadUiType("qt06.ui")[0]

class WindowClass(QMainWindow, form_class) :
    def __init__(self) :
        super().__init__()
        self.setupUi(self)
        self.btn.clicked.connect(self.myclick)
        self.t1.returnPressed.connect(self.myclick)
        
    def myclick(self):
        me = self.t1.text()
        res = ""
        com = ""
        rnd = random()
        if rnd > 0.5:
            com = "홀"
        else:
            com = "짝"
            
        if me == com:
            res = "내가이김ㅋ"
        else:
            res = "짐 ㅠㅠ"
        
        self.t2.setText(com)
        self.t3.setText(res)
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    myWindow = WindowClass() 
    myWindow.show()
    app.exec_()
