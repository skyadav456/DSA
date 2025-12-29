package likedlist;

public class LinkedListDeletion {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static  Node head=null;
    static  Node tail=null;

    // Insert at end (for testing)
     void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /* Delete first node*/
    void deleteAtFirst(){
        if(head==null){
            System.out.println(" Linked list is empty");
            return;
        }
        head= head.next;
    }

    /* delete from a particular Index  */
    void deleteNode(int idx){
        Node temp= head;
        if(head== null){
            System.out.println("List is empty");
            return;
        }
        if(idx<=0){
            System.out.println("Invalid Index");
            return;
        }

        if (idx == 1) {
            head= head.next;
        }

        for(int i=0;i<idx-1;i++){
            temp= temp.next;
        }
        temp.next= temp.next.next;
        tail=temp;        //--> to set the tail as null otherwise it will show previous value
    }

    /* delete last node */
    void deleteAtEnd(){
        if(head==null){
            System.out.println(" Linked list is empty");
            return;
        }
        if(head.next==null){
            head= null;
            return;
        }
        Node temp= head;
        while(temp.next.next!=null){
            temp= temp.next;
        }
        temp.next=null;
    }

    void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDeletion del= new  LinkedListDeletion();
        // insert the element
        del.insertAtEnd(10);
        del.insertAtEnd(20);
        del.insertAtEnd(30);
        del.insertAtEnd(40);
        del.insertAtEnd(50);
        del.display();
        System.out.println();

        // delete from end
        del.deleteAtEnd();
        del.display();
        System.out.println();

        // delete from the perticular index
        del.deleteNode(2);
        del.display();
        System.out.println();

        // delete from first
        del.deleteAtFirst();
        del.display();


    }
}
