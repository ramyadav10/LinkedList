package com.practice;

public class SingleLinkedListInsert {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedListInsert sl=new SingleLinkedListInsert();
		sl.addNode(56);
		sl.addNode(70);
		sl.insertAt(1,30);
		sl.display();
	}

public class Node{
	int data;
	Node next;
	
	public Node(int d) {
		this.data=d;
		this.next=null;
	}	
}
	Node head;
	public void addNode(int d) {
		Node node=new Node(d);
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	
	public void display() {
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public void insertAt(int index, int d) {
		Node node=new Node(d);
		Node n=head;
		for(int i=0;i<index-1;i++) {
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
		
		
	
}
