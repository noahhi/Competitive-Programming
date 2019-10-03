import functools

@functools.total_ordering
class Appointment():
    def __init__(self,h,m,z):
        self.hour = h
        self.minute = m
        self.meridiem = z

    def __eq__(self,other):
        return ((self.hour,self.minute,self.meridiem)==
                (other.hour,other.minute,other.meridiem))

    def __gt__(self,other):
        if self.meridiem == 'p.m.' and other.meridiem == 'a.m.':
            return True
        if self.meridiem == 'a.m.' and other.meridiem == 'p.m.':
            return False
        if int(self.hour) % 12 > int(other.hour) % 12:
            return True
        if int(self.hour) % 12 < int(other.hour) % 12:
            return False
        if int(self.minute) > int(other.minute):
            return True
        if int(self.minute) < int(other.minute):
            return False
        return False

    def __repr__(self):
        return str(self.hour) + ':' + str(self.minute) + ' ' + self.meridiem

start = True
while True:
    n = int(input())
    if n == 0:
        break
    if not start:
        print('')
    start = False
    appts = []
    for _ in range(n):
        time,meridiem = input().split()
        hour,minute = time.split(':')
        appts.append(Appointment(hour,minute,meridiem))
    appts.sort()
    for appt in appts:
        print(appt)