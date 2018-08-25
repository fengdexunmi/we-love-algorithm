#-*- coding:utf-8 -*-

"""
Davis' Staircase
"""


def stepPerms(n):
    steps = {0:1, 1:1, 2:2, 3:4}
    if n in [1, 2, 3]:
        return steps[n]
    else: 
        for i in range(4, n+1):
            steps[i] = steps[i - 1] + steps[i - 2] + steps[i - 3]
        return steps[n]


if __name__ == "__main__":
    print(stepPerms(5))      
