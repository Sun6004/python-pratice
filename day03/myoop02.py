from astropy.units import Bi
class JDragon:
    def __init__(self):
        self.cnt_company = 20
    def seat(self):
        self.cnt_company += 1

class Bin:
    def __init__(self):
        self.amount_oil = 100000000
    def dig(self):
        self.amount_oil *= 2

class KimJeungUn:
    def __init__(self):
        self.cnt_nuclear = 30
    def aoji(self):
        self.cnt_nuclear += 2

class KimJiWan(JDragon, Bin, KimJeungUn):
    def __init__(self):
        JDragon.__init__(self)
        Bin.__init__(self)
        KimJeungUn.__init__(self)

k = KimJiWan()
k.seat()
print(k.cnt_company)
k.dig()
print(k.amount_oil)
k.aoji()
print(k.cnt_nuclear)
k.aoji()
print(k.cnt_nuclear)


