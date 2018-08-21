#!/usr/bin/env python3
#-*- coding:utf-8 -*-

""" 
将数组a按照d值切开，然后交换顺序重组。这种方法省去了循环。
https://xiaozhuanlan.com/topic/6309714852

时间复杂度为O(1）
空间复杂度为O(1)
"""

import math
import os
import random
import sys

def rotLeft(a, d):
    d %= len(a)
    a = a[d:] + a[:d]
    return a

if __name__ == "__main__":
    a = [1, 2, 3, 4, 5]
    d = 2
    print(rotLeft(a, d))
