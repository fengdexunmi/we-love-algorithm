# We love algorithm

## Day1
Array Rotation Problem
数组旋转问题  
在Array进行Left Rotation就是将Array内每个元素向左移动一个位置。  
例如，对于[1,2,3,4,5]执行步长为2的Left Rotation后结果为[3,4,5,1,2]。

**Java实现**
```Java
/**
 * 列表左旋问题
 * 
 * 在Array进行Left Rotation就是将Array内每个元素向左移动一个位置。
 * 例如，对于[1,2,3,4,5]执行步长为2的Left Rotation后结果为[3,4,5,1,2]。
 * 
 * Instead of moving one by one, divide the array in different
 * sets where numbers of sets is equal to GCD of n and d and 
 * move the elements within sets.
 * https://www.geeksforgeeks.org/array-rotation/
 * 
 * 时间复杂度为O(n)
 * 空间复杂度为O(1)
 */
public class ArrayLeftRotation {
    /**
     * Function to left rotate arr[] of size n by d
     */
    public void leftRotate(int arr[], int d, int n) {
        int i, j, k, temp;
        for (i =0; i < gcd(d, n); i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /**
     * Function to print an array
     */
    public void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Functio to get gcd of a and b
     */
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        ArrayLeftRotation rotate = new ArrayLeftRotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}

```

**Python实现**
```Python
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
```

## Day2
判断链表中是否存在环，如果存在环，找到环的入口


## Day3 
- 冰淇淋店购买问题  `Ice Cream Parlor`  
Sunny 和 Johny 两个人要到冰淇淋店买冰淇淋。店里每次都有很多种口味，每种口味有自己的单价。他们俩一共带的钱总数为money，所有口味的单价组成一个列表是 cost。要求两个人必须将所带的钱消费完，买两种冰淇淋。假如每种冰淇淋在列表里从1开始标号，程序要打印出买的两种冰淇淋的标号（用空格分开）。  
Solution: [IceCremParlor.py](./day3/IceCreamParlor.py)

- Davis' Staircase  
Davis家楼梯有n级台阶，Davis每次只能爬1，2或者3级台阶，对于n级台阶，Davis有几种不同的爬法？  
Solution: [DavisStaircase.py](./day3/DavisStaircase.py)

- Queue Jumper  
一家蛋糕店门口排了很长的队伍，每个人身上都有一个原始编号，队伍最开始的人为 1，往后依次增加 1。
队伍里的任何一个人都可以贿赂他正面前的那个人来交换位置。
交换位置后，他们身上的编号不变。每个人最多可以贿赂两个人。
例如，队伍里最初有 8 个人，然后 5 号贿赂了 4 号，新的队伍编号就变成了1，2，3，5，4，6，7，8。
我们的问题是，给出最后的状态，我们要求出最少经过多少次贿赂，
可以达到给定的状态。如果不能通过交换达到给定状态，则打印 Too chaotic。 
**问题分析**：  
  + 对于每个人，他和他自己原来标号的绝对差不会超过 2；
  + 要得到状态的最小交换次数，就是数一下自己前面的人有多少原来是在自己后面的。  
Solution: [QueueJumper.py](./day3/QueueJumper.py)
