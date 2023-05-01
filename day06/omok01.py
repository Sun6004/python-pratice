import sys
from PyQt5 import uic, QtGui
from PyQt5.QtWidgets import QApplication, QMainWindow, QPushButton
from PyQt5.QtGui import QIcon
from PyQt5.QtCore import QSize

form_class = uic.loadUiType("myOmok01.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.flag_dol = True
        
        for i in range(361):
            btn = QPushButton("", self)
            btn.setIcon(QIcon("0.png"))
            btn.setIconSize(QSize(33, 33))
            btn.setGeometry(0 + 33 * (i % 19), 0 + 33 * (i // 19), 33, 33)
            btn.clicked.connect(self.click_btn)
        
    def click_btn(self):
        icon = QIcon("1.png")
        icon2 = QIcon("2.png")
        sender = self.sender()
          
        if self.flag_dol == True:
            sender.setIcon(icon)
            
        else:
            sender.setIcon(icon2)
        self.flag_dol = not self.flag_dol

if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = WindowClass() 
    myWindow.show()
    app.exec_()
