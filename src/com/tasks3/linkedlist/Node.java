package com.tasks3.linkedlist;

class Node {
	private Node next;
	private Integer data;

	public Node() {}
	public void setData(Integer data) {	this.data = data; }
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
	public Integer getData() {
		return data;
	}

}
