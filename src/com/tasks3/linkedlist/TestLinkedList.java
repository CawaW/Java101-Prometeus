package com.tasks3.linkedlist;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		printAll(ll);
		System.out.println("deleted = " + ll.delete(2));
		printAll(ll);
	}

	public static void printAll(LinkedList ll){
		System.out.println("LinkedList Size = " + ll.size());
		for (int i = 0; i < ll.size(); i++) {
			System.out.println("Node" + i + " = " + ll.get(i));
		}
	}
}
