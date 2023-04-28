import sys
from PyQt5 import uic
from PyQt5.QtWidgets import *

form_class = uic.loadUiType("qt09.ui")[0]

class WindowClass(QMainWindow, form_class) :
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.btn.clicked.connect(self.click) 

    def click(self):
        num = int(self.t1.text())
        res = ""
        
        for i in range(1, 10):  
            res += "{}*{}={}\n".format(num,i,i*num)
        
        self.t2.setPlainText(res)
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    myWindow = WindowClass() 
    myWindow.show()
    app.exec_()
