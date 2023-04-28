import sys
from PyQt5 import uic
from PyQt5.QtWidgets import *

form_class = uic.loadUiType("qt08.ui")[0]

class WindowClass(QMainWindow, form_class) :
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.btn.clicked.connect(self.click) 

    def click(self):
        res = 0
        num1 = int(self.t1.text())
        num2 = int(self.t2.text())
        num3 = int(self.t3.text())
        
        for i in range(num1, num2+1):
            if i % num3 == 0:
                res += i          
        self.t4.setText(str(res))    
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    myWindow = WindowClass() 
    myWindow.show()
    app.exec_()
