class Animal:
    def __init__(self):
        self.age = 1
    
    def birth(self):
        self.age += 1

ani = Animal()
print(ani.age)
ani.birth()
print(ani.age)        