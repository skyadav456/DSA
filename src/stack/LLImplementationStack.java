package stack;


class MyStack{
    Node head;
    int len;

    int peak(){     // head value of LL
        if(head==null){
            System.out.println("Empty stack");
            return -1;
        }
        else{
            return head.val;
        }
    }

    int pop(){
        if(head==null) {
            System.out.println("Empty stack");
            return -1;
        }else{
            int x=head.val;
            head=head.next;
            len--;     // size decrease
            return x;
        }
    }

    void push(int val){
        Node newNode=new Node(val);
        if(len==0){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        len++;
    }

    int size(){
        return len;
    }

    void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class LLImplementationStack {
    public static void main(String[] args) {

        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        stack.pop();
        stack.display();

        System.out.println(stack.size());

    }
}
