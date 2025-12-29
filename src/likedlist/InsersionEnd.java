package likedlist;


public class InsersionEnd {
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head= null;
    int size=0;


    void insertAtEnd(int data){
        Node newNode= new Node(data);
        if(head== null){
            head=newNode;
        }else{
            Node temp= head;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next= newNode;
        }
        size++;
    }

    /*  insert at the beginning
    *  case 1 :  when List are empty ---> means the head is null
    *               make the new node as head
    *  case 2 :  when list are not empty --->    make the newNode.next  as head and head as newNode
    *  */

    void insetAtStarting(int data){
        Node newNode= new Node(data);
        if(head== null){
            head= newNode;
        }else{
            newNode.next= head;
            head= newNode;
        }
        size++;
    }

    /* Insert At any Index
    *   need ->  index and element as method argument
    *   goto (index-1)th node  and add there
    * */

    void insertAtIndex(int data, int idx){
        Node newNode= new Node(data);
        if(idx<=0){
            System.out.print("Invalid Index");
            return;
        }
        // when idx= 1   at beginning
        if(idx==1){
            insetAtStarting(data);
            return;
        }
        Node temp= head;
        // At (n-1) node
        for(int i= 0; i<idx-1;i++){
            temp= temp.next;
        }
        newNode.next= temp.next;
        temp.next= newNode;

        // At the end (length+1)

    }
    void display() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        InsersionEnd a= new InsersionEnd();
        a.insertAtEnd(10);   // 10
        a.insertAtEnd(20);   // 10 20
        a.insertAtEnd(30);   // 10 20 30
        //.display();

        a.insetAtStarting(5); //5 10 20 30
        //a.display();
        a.insertAtIndex(23,2);
        a.display();

        System.out.println();
//      System.out.println(a.size);

    }
}
