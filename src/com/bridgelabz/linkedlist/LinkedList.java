package com.bridgelabz.linkedlist;
/**
 * Purpose : We have to create a simple Linked List to store 3 values.
 * @author Utkarsh Mishra
 * @since 2021/09/24
 */

/*
Simply created the method for welcome message.
 */
public class LinkedList {
    public static void display(){
        System.out.println("Welcome to Data Structure Problems using Java Generics");
    }
    public static void main(String[] args) {
        display();
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        Node tail = thirdNode;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
