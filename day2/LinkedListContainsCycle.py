#-*- coding:utf-8 -*-
"""  
判断链表是否环
A linked list is said to contain a cycle if any node 
is visited more than once while traversing the list.
"""


""" 链表结点定义 """
class Node(object):
    def __init__(self, data=None, next_node=None):
        self.data = data
        self.next = next_node
        

"""
快指针和慢指针解决
采用两个指针，一个快（每次移动两步）一个慢（每次移动一步）
如果链表存在环，则快指针和慢指针肯定会相遇
（只需要遍历链表，不需要改变链表本身结构）
"""
def has_cycle(head):
    if head is None:
        return False
    slow = fast = head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return True
    return False


""" 
如果链表有环，找到环的入口 
快慢指针相遇后，让慢指针从头开始遍历，快指针速度变成和慢指针一样
再次相遇的点就是环的入口
"""
def find_start_of_cycle(head):
    if head is None:
        return False
    slow = fast = head
    loopExist = False
    
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            loopExist = True
            break
    
    if loopExist == True:
        slow = head
        while slow != fast:
            fast = fast.next
            slow = slow.next
        return slow.data

    return False


if __name__ == "__main__":
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)
    node4 = Node(4)
    node5 = Node(5)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node3
    print(has_cycle(node1))
    print(find_start_of_cycle(node1))
