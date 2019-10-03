def main():

    people = {}
    first_print = True
    
    while True:
        line = input().split(' ', 1)
        command = line[0]
        if command == "QUIT":
            break
        
        info = line[1].split(':')
            
        if command == "BIRTH":
            name = info[0].strip()
            dob = info[1].strip()
            
            mom_name = info[2].strip()
            if mom_name in people:
                mom = people[mom_name]
            else:
                mom = Person(mom_name)
                people[mom_name] = mom
                
            dad_name = info[3].strip()
            if dad_name in people:
                dad = people[dad_name]
            else:
                dad = Person(dad_name)
                people[dad_name] = dad

            person = Person(name,dob,mom,dad)
            people[name] = person

            mom.add_child(person)
            dad.add_child(person)

        elif command == "DEATH":
            name = info[0].strip()
            death_date = info[1].strip()
            person = people[name]
            person.died(death_date)

        elif command == "ANCESTORS":
            if first_print:
                first_print = False
            else:
                print('')
            name = info[0].strip()
            print('ANCESTORS of ' + name)
            print_ancestors(people, name, 0)

        elif command == "DESCENDANTS":
            if first_print:
                first_print = False
            else:
                print('')
            name = info[0].strip()
            print('DESCENDANTS of ' + name)
            print_descendants(people, name, 0)


def print_descendants(people, name, gen):  
    person = people[name]

    if gen > 0: 
        description = gen*'  ' + name
        if person.has_dob:
            description += ' ' + person.dob + ' -'
            if person.has_died:
                description += ' ' +person.death_date
        print(description)
        
    kids = person.get_children()
    for kid in kids:
        print_descendants(people, kid.name, gen+1)
            
def print_ancestors(people, name, gen):  
    person = people[name]

    if gen > 0: 
        description = gen*'  ' + name
        if person.has_dob:
            description += ' ' + person.dob + ' -'
            if person.has_died:
                description += ' ' +person.death_date
        print(description)
        
    parents = person.get_parents()
    if parents is not None:
        print_ancestors(people, parents[0].name, gen+1)
        print_ancestors(people, parents[1].name, gen+1)

class Person:
    has_parents = False
    has_dob = False
    has_died = False
    
    def __init__(self, name, dob=None, mom=None, dad=None):
        self.name = name
        self.dob = dob
        self.mom = mom
        self.dad = dad

        self.children = []

        if dob is not None:
            self.has_dob = True
        if mom is not None:
            self.has_parents = True
        

    def get_parents(self):
        if self.has_parents:
            if self.mom < self.dad:
                return (self.mom, self.dad)
            else:
                return (self.dad, self.mom)
        else:
            return None

    def add_child(self, child):
        self.children.append(child)

    def get_children(self):
        self.children.sort()
        return self.children

    def died(self, date):
        self.has_died = True
        self.death_date = date

    def __lt__(self, other):
        if self.name < other.name:
            return True
        return False

    def __gt__(self, other):
            return other.__lt__(self)

    def __eq__(self, other):
        return self.name == other.name

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        return self.name

if __name__ == "__main__":
    main()