package com.practice;

public class SingleLinkedList {

    private Node H;
    private Node T;

    //addNode() will add a new node to the list, Create a new node, Checks if the list is empty by using head address
    public void addNode(int x){
        Node newNode = new Node(x);

        if (H == null){
            H = newNode;
        }else{
            T.next = newNode;
            T = newNode;
        }
        T = newNode;
    }
    
    public static class Node{
        private int data;
        private Node next;

        public Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    
    //displayList() will display all the nodes
    public void displayList(){
        Node temp = H;
        if (H == null){
            System.out.println("Linked List is Empty");
        }
        System.out.println("Nodes: Singly Linked List :");
        while (temp != null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        SingleLinkedList sList = new SingleLinkedList();

        //Add nodes to the list
        sList.addNode(56);
        sList.addNode(30);
        sList.addNode(70);

        //Call the Displays Method
        sList.displayList();
    }
}