package com.lsl.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 面试题06. 从尾到头打印链表 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 * public class ListNode { * int val; *
 * ListNode next; * ListNode(int x) { val = x; } * }
 * 1.采用递归的方式
 * 2.采用栈
 * @author shiliang.li
 * @date 2020/6/4
 */
public class Demo06 {
    private static Stack<Integer> result = new Stack<>();
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        Demo06 demo06 = new Demo06();
        int[] ints = demo06.reversePrint1(listNode1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }

    public int[] reversePrint(ListNode head) {

        int[] arr = new int[list.size()];
        if (head == null) {
            return arr;
        }
        digui(head);

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public void digui(ListNode node) {
        if (node == null) {
            return;
        }
        digui(node.next);
        list.add(node.val);
    }



    public int[] reversePrint1(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = head.next;
        }

        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop().val;
        }
        return arr;

    }



    static class ListNode {
        private Integer val;

        private ListNode next;

        public ListNode(int x) {
            val = x;
        }

    }

}
