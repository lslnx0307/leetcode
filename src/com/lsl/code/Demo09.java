package com.lsl.code;

import java.util.Stack;

/**
 *
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead
 * ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 实现思路
 * 声明两个栈 栈1存储元素 栈2 辅佐操作
 * @author shiliang.li
 * @version v1.0
 * @date 2020/6/19
 */
public class Demo09 {
    private static Stack<Integer> stack1;
    private static Stack<Integer> stack2;
    public Demo09() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void appendTail(int value) {
        if (stack1.isEmpty()) {
            stack1.push(value);
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(value);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            return -1;
        }
        return stack1.pop();
    }

    public static void main(String[] args) {
        Demo09 demo09 = new Demo09();
        demo09.appendTail(1);
        demo09.appendTail(2);
        demo09.appendTail(3);
        System.out.println(demo09.deleteHead());
    }

}
