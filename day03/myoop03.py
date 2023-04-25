class Biden:
    def __init__(self):
        print("생성자")
    def ira(self):
        print("ira")
    def __del__(self):
        print("소멸자")
        
b = Biden()
b.ira()