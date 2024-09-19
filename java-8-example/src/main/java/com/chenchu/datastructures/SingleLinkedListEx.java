package com.chenchu.datastructures;

public class SingleLinkedListEx {
	 private Node head;
	 
	 SingleLinkedListEx(){
		 this.head = null;
	 }
	 
	 
	 public void addNode(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }
	 
	 
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
