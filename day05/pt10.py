import sys
from PyQt5 import uic
from PyQt5.QtWidgets import *

form_class = uic.loadUiType("qt10.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.btn.clicked.connect(self.click) 

    def click(self):
        num1 = int(self.t1.text())
        num2 = int(self.t2.text())
        res = ""        
        
        for i in range(num1+1, num2+2):
            for j in range(1, num1-i):
                res += " "
            for k in range(1, i*(2-1)):
                res += "*"
            res += "\n" 
        r = ""
        for i in range(num1+1, num2+1):
            r += "*"
        self.t3.setText(res)

if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = WindowClass() 
    myWindow.show()
    app.exec_()
