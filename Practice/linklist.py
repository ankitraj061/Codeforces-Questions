class Node:
    def __init__(self, data, prev=None, next=None):
        self.data = data
        self.next = next
        self.prev = prev

    def __str__(self):
        return str(self.data)


class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def __len__(self):
        return self.size

    def __str__(self):
        if self.__isEmpty__():
            return "Empty Doubly Linked List"
        current = self.head
        elements = []
        while current:
            elements.append(str(current.data))
            current = current.next
        return " <-> ".join(elements)

    def __isEmpty__(self):
        return self.size == 0

    def append(self, data):
        newNode = Node(data)
        if self.__isEmpty__():
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            newNode.prev = self.tail
            self.tail = newNode
        self.size += 1
    def addFirst(self,data):
        newNode = Node(data)
        if self.__isEmpty__():
            self.head = newNode
            self.tail = newNode
        else:
            self.head.prev = newNode
            newNode.next = self.head
            self.head = newNode
        self.size += 1
    def addLast(self, data):
        self.append(data)

    def insert(self, index, data):
        if index < 0 or index > self.size:
            raise Exception("Invalid index")
        if index == 0:
            self.addFirst(data)
        elif index == self.size:
            self.append(data)
        else:
            newNode = Node(data)
            current = self.head
            for _ in range(index):
                current = current.next
            newNode.prev = current
            newNode.next = current.next
            current.next = newNode
            current.next.prev = newNode
        self.size += 1

    def removeFirst(self):
        if self.__isEmpty__():
            return
        if self.head == self.tail:
            self.head = None
            self.tail = None
        else:
            self.head = self.head.next
            self.head.prev = None
        self.size -= 1
    def removeLast(self):
        if self.__isEmpty__():
            return
        if self.head == self.tail:
            self.head = None
            self.tail = None
        else:
            self.tail = self.tail.prev
            self.tail.next = None
        self.size -= 1
    def remove(self, data):
        if self.__isEmpty__():
            return
        current = self.head
        while current:
            if current.data == data:
                if current == self.head:
                    self.removeFirst()
                elif current == self.tail:
                    self.removeLast()
                else:
                    current.prev.next = current.next
                    current.next.prev = current.prev
                    self.size -= 1
                return
            current = current.next
        raise Exception("Data not found")
    def search(self, data):
        if self.__isEmpty__():
            return
        current = self.head
        while current:
            if current.data == data:
                return True
            current = current.next
        return False
    
    trav=None
    def __iter__(self):
        self.trav = self.head
        return self
    def __next__(self):
        if self.trav is None:
            raise StopIteration
        data = self.trav.data
        self.trav = self.trav.next
        return data
    


dll = DoublyLinkedList()
dll.append(10)
print(dll)
dll.append(20)
print(dll)
dll.addFirst(5)
print(dll)
dll.addLast(50)
print(dll)
dll.removeLast()
print(dll)
dll.removeFirst()
print(dll)
dll.insert(1, 25)
print(dll)


for i in dll:
    print(i)