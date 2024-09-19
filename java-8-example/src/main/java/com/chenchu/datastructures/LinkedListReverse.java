package com.chenchu.datastructures;

import java.util.LinkedList;

public class LinkedListReverse {

	static Node head;

	private static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void printNode() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " --  ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static Node reverseList(Node head) {
		Node prev = head.next;
		Node next = head.next.next;
		head.next = null;

		while (prev != null) {
			prev.next = head;
			head = prev;
			prev = next;
			if (next != null)
				next = next.next;
		}
		return head;
	}

	public static void main(String[] args) {

		// creating and inserting node data
		LinkedListReverse.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);

		// Connection of Nodes
		LinkedListReverse.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next=sixth;

		LinkedListReverse.printNode();
		LinkedListReverse.head = LinkedListReverse.reverseList(LinkedListReverse.head);
		LinkedListReverse.printNode();
	}

}
