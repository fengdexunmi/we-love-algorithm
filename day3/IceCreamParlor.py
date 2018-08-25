#-*- coding:utf-8 -*-

"""
冰淇淋够买问题
"""

def whatFlavors(cost, money):
    cost_dict = {}
    for i, v in enumerate(cost):
        if money - v in cost_dict:
            print(cost_dict[money - v] + 1, i + 1)
            break
        cost_dict[v] = i


if __name__ == "__main__":
     cost = [2, 1, 3, 5, 6]
     whatFlavors(cost, 5)