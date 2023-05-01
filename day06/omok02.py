import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow, QPushButton
from PyQt5.QtGui import QIcon
from PyQt5.QtCore import QSize


form_class = uic.loadUiType("myOmok02.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.flag_dol = True
        self.arr2D=[
            [0,1,0,0,0, 0,0,0,0,0],
            [0,1,1,0,0, 0,0,0,0,0],
            [1,0,1,2,0, 0,0,0,0,0],
            [0,1,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0]      
        ]
        
        self.pbs=[]
        
        for i in range(10):
            for j in range(10):
                btn = QPushButton("", self)
                btn.setToolTip("{},{}".format(i,j))
                btn.setIcon(QIcon("0.png"))
                btn.setIconSize(QSize(40, 40))
                btn.setGeometry(j*40, i*40, 40, 40)
                btn.clicked.connect(self.click_btn)
                self.pbs.append(btn)
        self.myrender()
        
    def myrender(self):
        for i in range(10):
            for j in range(10):
                if self.arr2D[i][j]==0:
                    self.pbs[i*10+j].setIcon(QIcon("0.png"))
                if self.arr2D[i][j]==1:
                    self.pbs[i*10+j].setIcon(QIcon("1.png"))
                if self.arr2D[i][j]==2:
                    self.pbs[i*10+j].setIcon(QIcon("2.png"))

    def checkUp(self, i, j, stone):
        cnt = 0
        while True:
            i -= 1
            if i <0:
                return cnt
            if self.arr2D[i][j] == stone:
                cnt += 1
            else:
                return cnt
   
    def checkDown(self, i, j, stone):
        cnt = 0
        try:
            while True:
                i += 1
                if i <0:
                    return cnt
                if self.arr2D[i][j] == stone:
                    cnt += 1
                else:
                    return cnt              
        except:
            return cnt
            
    
    def click_btn(self):
        #sender 이용
        #i j 구하기
        str_ij = self.sender().toolTip()
        arr_ij = str_ij.split(",")
        i = int(arr_ij[0])
        j = int(arr_ij[1])
        
        if self.arr2D[i][j] > 0:
            return
        stone = -1
        if self.flag_dol:
            self.arr2D[i][j] = 1
            stone = 1
        else:
            self.arr2D[i][j] = 2
            stone = 2
            
        up = self.checkUp(i,j,stone)
        dwn = self.checkDown(i,j,stone)
        print("dwn: ",dwn)
        
        self.myrender()
        self.flag_dol = not self.flag_dol        

if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = WindowClass() 
    myWindow.show()
    app.exec_()
