def solution(data):
    return data


if __name__ == '__main__':
    
    '''
    实例一：
    
    题目需要单行输入一串数字  例如接受 1 2 3
    input()将查询用户的输入，并读取一行用户输入
    .split()会将输入拆分为“单词”列表
    map(int, ...)会在每个单词上调用int ，它会懒惰地调用int （尽管这在这里并不重要）； 
    a, b, c = ...将把表达式分解成两个元素，并将第一个分配给a ，第二个分配给b, 第三个分配给c
    '''
    a,b,c = map(int, input().split())
    
    
    '''
    实例二：
    直接将单行输入的数字一次转换后放入链表
    input()将查询用户的输入，并读取一行用户输入
    .split()会将输入拆分为“单词”列表
    int(i) for i in list 将单词链表转换为整型链表
    '''
    lists1 = [int(i) for i in input().split()]
    
    
    '''
    实例三：
    题目需要单行输入一串数字  例如接受 1 2 3
    input()将查询用户的输入，并读取一行用户输入
    .split()会将输入拆分为“单词”列表
    map(int, ...)会在每个单词上调用int ，它会懒惰地调用int （尽管这在这里并不重要）； 
    list(..)部分强制转换map对象结果为list
    '''
    
    lists2 = list(map(int, input().split()))
    
    print(solution(lists2))
