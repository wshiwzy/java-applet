package me.wuzhaoyang.javaapplet;

import me.wuzhaoyang.javaapplet.model.Node;

/**
 * Created by john on 17/3/29.
 * 链表相关的操作
 */
public class ListApplet {

    /**
     * 寻找单链表的中间节点<br>
     * 说明:设置快慢指针,快指针步长为2,慢指针步长为1.当快指针到达尾节点,慢指针到达中间节点.
     *
     * @param head 链表头节点
     * @return 中间节点
     */
    public static Node findMidElement(Node head) {
        //无元素或者只有一个元素,返回自己即可
        if (head == null || head.next == null) return head;
        Node fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 判断单链表是否有环<br>
     * 说明:如果有环快慢节点必定相遇
     *
     * @param head 链表头节点
     * @return true有环/false无环
     */
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) return false;
        Node fast, slow;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        return slow == fast;
    }


}
