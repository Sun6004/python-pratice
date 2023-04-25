from day03.my_def04 import Animal
import re

class Human(Animal):
    def __init__(self):
        super().__init__()
        self.tools = ["knife"]
            
    def farming(self, tool):
        self.tools.append(tool)
    
    def __str__(self):
        ret = str(self.tools)
        return ret
    
h = Human()
h.birth()

print(h.tools)
h.farming("drag")
h.farming("soju")
print(h.tools)
h.birth()
print(h.age)