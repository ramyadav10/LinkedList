package com.practice;

import com.practice.SingleLinkedListDeleteEnd.Node;

public class SingleLinkedListSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedListSearch sl=new SingleLinkedListSearch();
		sl.addNode(56);
		sl.addNode(70);
		sl.addNode(54);
		sl.addNode(34);
		sl.insertAt(1,30);
		sl.deleteAtFirst();
		sl.deleteAtEnd();
		
		sl.searchNode(30);
		
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
	
	public void deleteAtFirst() {
		
		if (head == null){
        }else {
            head = head.next;
        }
	}

public void deleteAtEnd() {
		
	 if (head == null && head.next == null){
         return;
     }
     Node temp = head;
     while (temp.next.next!= null){
         temp = temp.next;
     }
     temp.next = null;
     
}

	public void searchNode(int traget){
        int i=0;
        while (head != null){
            i++;
            if (head.data == traget){
                System.out.println(traget+" Value is at "+ i + " Node");
            }
            head = head.next;
        }
        System.out.println("Singly Linked List is Empty");
    }
}	