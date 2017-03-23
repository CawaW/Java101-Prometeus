package com.tasks3.linkedlist;

public class LinkedList {
	private Node first;
	private Node last;
	private int size;

	public LinkedList() {
		first = null;
		last = null;
		size = 0;
	}

	public void add(Integer data) {
		Node node = new Node();
		node.setData(data);
		if (first == null) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
		size++;
	}

	public Integer get(int index) {
		if (size() == 0 || index > size - 1 || index < 0) { return null; }
		Node node = first;
		for (int i = 0; i < index; i++) { node = node.getNext(); }
		return node.getData();
	}

	public boolean delete(int index) {
		if (size() == 0 || index > size - 1 || index < 0) { return false; }
		if (index == 0) {
			first = first.getNext();
			size--;
			return true;
		}
		if (index == size - 1) {
			Node node = first;
			for (int i = 0; i < index - 1; i++) { node = node.getNext(); }
			last = node;
			node.setNext(null);
			size--;
			return true;
		}
		Node node = first;
		for (int i = 0; i < index - 1; i++) { node = node.getNext(); }
		node.setNext(node.getNext().getNext());
		size--;
		return true;
	}

	public int size() {	return size;}
}
