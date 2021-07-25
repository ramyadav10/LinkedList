package com.practice;

public class SingleLinkedListCreate {

    private Node H;
    private Node T;

    public void ShowList(){
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

    //Add nodes to the list at Beginning
     public void addToStart(int x){
        if (H == null){
            this.H = new Node(x);
        }else{
            Node temp = new Node(x);
            temp.next = H;
            H = temp;
        }
     }
     public static class Node{
         private int data;
         private Node next;

         public Node(int x){
             this.data = x;
             this.next = null;
         }
     }

    public static void main(String[] args) {
    	SingleLinkedListCreate sList = new SingleLinkedListCreate();

        sList.addToStart(70);
        sList.addToStart(30);
        sList.addToStart(56);


        sList.ShowList();
    }
}