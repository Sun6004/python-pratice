import sys
from PyQt5 import uic
from PyQt5.QtWidgets import *
from random import random

form_class = uic.loadUiType("qt07.ui")[0]

class WindowClass(QMainWindow, form_class) :
    def __init__(self) :
        super().__init__()
        self.setupUi(self)
        self.btn1.clicked.connect(self.myclcik) 
        self.btn2.clicked.connect(self.myclcik) 
        self.btn3.clicked.connect(self.myclcik) 
        self.btn4.clicked.connect(self.myclcik) 
        self.btn5.clicked.connect(self.myclcik) 
        self.btn6.clicked.connect(self.myclcik) 
        self.btn7.clicked.connect(self.myclcik) 
        self.btn8.clicked.connect(self.myclcik) 
        self.btn9.clicked.connect(self.myclcik) 
        self.btn0.clicked.connect(self.myclcik) 

        self.btn.clicked.connect(self.mycall) 
       
    def mycall(self):   
        str_num = self.te.text()
        QMessageBox.about(self,'Calling',str_num)
        
    def myclcik(self):
        str_new = self.sender().text()
        str_old = self.te.text()
        self.te.setText(str_old+str_new)
        
        print(self.sender().text())
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    myWindow = WindowClass() 
    myWindow.show()
    app.exec_()
