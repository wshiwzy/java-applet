package me.wuzhaoyang.javaapplet.model;

/**
 * Created by john on 17/3/29.
 * 节点定义
 */
public class Node {

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(){
    }

    //数据域
    public Object data;
    //指针域
    public Node next;
}
