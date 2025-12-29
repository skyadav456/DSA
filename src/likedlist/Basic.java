package likedlist;

import java.util.Scanner;

import static likedlist.Basic.Node.display;

public class Basic {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        // display the node
        static void display(Node head){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }

        }
    }
    public static void main(String[] args) {

        // creating node
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        // adding node
        a.next=b;
        b.next=c;

        display(a);

      /*  System.out.print(a.data+" ");  // 5
        System.out.print(b.data+" "); // 6*/



    }
}
