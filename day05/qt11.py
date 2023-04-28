import sys
from PyQt5 import uic
from PyQt5.QtWidgets import *
import random

form_class = uic.loadUiType("qt11.ui")[0]

class WindowClass(QMainWindow, form_class):
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    
    num1 = str(random.choice(arr))
    ck2 = str(random.choice(arr))
    ck3 = str(random.choice(arr))
    
    if num1 != ck2:
        num2 = ck2
    else:
        num2 = str(random.choice([x for x in arr if x != int(num1)]))
    
    if num1 != ck3 and num2 != ck3:
        num3 = ck3
    else:
        num3 = str(random.choice([x for x in arr if x not in [int(num1), int(num2)]]))
    
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.btn.clicked.connect(self.click) 

    def click(self):
        n1 = WindowClass.num1
        n2 = WindowClass.num2
        n3 = WindowClass.num3
        
        com = n1 + n2 + n3
        print(com)     
        mine = self.t1.text()
        s = 0
        b = 0
        
        m1 = mine[0:1]
        m2 = mine[1:2]
        m3 = mine[2:3]
        
        if n1 == m1:
            s += 1
        if n2 == m2:
            s += 1
        if n3 == m3:
            s += 1
        
        if n1 == m2 or n1 == m3:
            b += 1
        if n2 == m1 or n2 == m3:
            b += 1
        if n3 == m1 or n3 == m2:
            b += 1
       
        result_str = mine + "\t" + str(s) + "S " + str(b) + "B" + "\n"
        if s == 3:
            QMessageBox.about(self, '정답입니다!')
            app.quit()
        
        self.pt.setPlainText(result_str)
         
if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = WindowClass() 
    myWindow.show()
    app.exec_()
