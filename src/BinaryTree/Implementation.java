package BinaryTree;


class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Implementation {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        display(a );
        System.out.println();
        System.out.println("size: "+size(a));  // size of tree
        System.out.println("Sum: "+sum(a));    // sum of all nodes
        System.out.println("Max : "+max(a));   // maximum value in the tree
        System.out.println("Min : "+min(a));   // minimum value in the tree
        System.out.println("product : +" + product(a));

    }
     private static int product(Node root){
        if(root==null) return 1;
        return root.data*product(root.left) * product(root.right);
     }

    private static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
    }

    private static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }

    private static int sum(Node root){
        if(root==null) return 0;
        return root.data+sum(root.left)+
                sum(root.right);
    }

    private static int size(Node root){
        /*if(root==null) return 0;
        return 1+ size(root.left)+ size(root.right);*/

        return (root==null) ? 0 : (1+ size(root.left)+ size(root.right));
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }


}
