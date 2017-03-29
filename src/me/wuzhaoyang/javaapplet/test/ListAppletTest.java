package me.wuzhaoyang.javaapplet.test;

import me.wuzhaoyang.javaapplet.ListApplet;
import me.wuzhaoyang.javaapplet.model.Node;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by john on 17/3/29.
 * 链表操作单元测试
 */
public class ListAppletTest {

    @Test
    public void findMidElementTest() throws Exception {
        Node head = new Node("0", null);
        Node tail = head;
        int i = 0;
        do {
            Node node = new Node(++i, null);
            tail.next = node;
            tail = node;
        } while (i < 11);
        printElement(head);

        Node midElement = ListApplet.findMidElement(head);
        System.out.println("中间节点是:" + midElement.data);
        Assert.assertEquals("6", midElement.data);
    }

    @Test
    public void hasCycleTest() throws Exception {

        Node head = new Node("0", null);
        Node tail = head;
        int i = 0;
        do {
            Node node = new Node(++i, null);
            tail.next = node;
            tail = node;
        } while (i < 11);
        Assert.assertTrue(!ListApplet.hasCycle(head));
        //链接
        tail.next = head.next.next;
        Assert.assertTrue(ListApplet.hasCycle(head));
    }

    private void printElement(Node head) {
        StringBuilder result = new StringBuilder();
        if (head == null) System.out.println("empty");
        Node p = head;

        while (p != null) {
            result.append(String.valueOf(p.data));
            result.append("-->");
            p = p.next;
        }
        result.append("NULL");
        System.out.println(result.toString());
    }

}