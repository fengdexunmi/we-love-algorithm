# -*- coding:utf-8 -*-

"""
Queue Jumper
一家蛋糕店门口排了很长的队伍，每个人身上都有一个原始编号，队伍最开始的人为 1，往后依次增加 1。
队伍里的任何一个人都可以贿赂他正面前的那个人来交换位置。
交换位置后，他们身上的编号不变。每个人最多可以贿赂两个人。
例如，队伍里最初有 8 个人，然后 5 号贿赂了 4 号，新的队伍编号就变成了1，2，3，5，4，6，7，8。
我们的问题是，给出最后的状态，我们要求出最少经过多少次贿赂，
可以达到给定的状态。如果不能通过交换达到给定状态，则打印 Too chaotic。
"""

def minimumBribes(q):
    idx_num = 0
    for i in range(len(q)):
        if q[i] - i > 3:
            print('Too chaotic')
            return
        for j in range(max(0, q[i] - 2), i):
            if q[j] > q[i]:
                idx_num += 1
    print(idx_num)

if __name__ == "__main__":
    q1 = [2, 1, 5, 3, 4]
    q2 = [2, 5, 1, 3, 4]
    minimumBribes(q1)
    minimumBribes(q2)

