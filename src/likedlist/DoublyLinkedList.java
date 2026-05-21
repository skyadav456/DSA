package likedlist;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val){
        this.val = val;
    }

}

class DLL{
    ListNode head;
    ListNode tail;

    int size;

    void insertAtHead(int val){
        ListNode newNode = new ListNode(val);
        if(head==null) head=tail=newNode;
        else{
            newNode.next= head;
            head.prev=newNode;
            head= newNode;
        }
        size++;
    }

    void insertAtTail(int val){
        ListNode newNode = new ListNode(val);
        if(head==null) head=tail=newNode;

        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }

    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void deleteAtHead(){
        if(size==0) {
            System.out.println("List is empty");
            return;
        }
        if(size==1){
            head=tail=null;
        }else{
            head=head.next;
            head.prev=null;
        }
        size --;
    }

    void deleteAtTail(){
        if(size==0) {
            System.out.println("List is empty");
            return;
        }
        if(size==1){
            head=tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
        }
        size --;
    }

    void insertAtIndex(int idx, int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid index");
            return;
        }
        ListNode newNode= new ListNode(val);
        if(head==null) head=tail=newNode;
        if(idx==0){
            head.prev=newNode;
        }
        else{
            ListNode temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;           // at n-1 position
            }
            newNode.next= temp.next;
            newNode.prev=temp;
            temp.next=newNode;
            newNode.next.prev=temp;

            size++;
        }
    }





}
public class DoublyLinkedList {
    public static void main(String[] args) {

        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.display();

        list.insertAtTail(50);
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.display();

        list.displayReverse();


        list.deleteAtHead();
        list.display();

        list.insertAtIndex(3,90);
        list.display();

    }
}
