package Trees;


class Node{
    int value;
    Node right,left;
    public Node(int val){
        this.value=val;
        right=null;
        left=null;
    }
    public Node(){
        this.value=0;
        right=null;
        left=null;

    }
}
public class BinaryTree {
   public Node root,rightTemp,leftTemp;
    public BinaryTree(int val){
        root=new Node(val);
    }
    public BinaryTree(){
        root=null;
    }
    public void addRootNode(int val){
        if(root==null){
            root=new Node(val);
            rightTemp=root;
            leftTemp=root;

        }
    }

    public void addLeftNode(Node newNode){

           // Node newNode=new Node(val);
            //Node temp=new Node();
            leftTemp.left=newNode;
            leftTemp=leftTemp.left;


        //Node newNode=new Node(val);
    }
    public void addRightNode(Node newNode){

           // Node newNode=new Node(val);
            //Node temp=new Node();
        rightTemp.right=newNode;
        rightTemp=rightTemp.right;



        //Node newNode=new Node(val);
    }
    public void addChild(int val){

        if(root==null){
            root=new Node(val);
            return;
        }
        Node current=root;

        while(current!=null) {

            if (current.value < val) {
                System.out.println(current.value+" r");
                current=current.right ;//= new Node(val);

            } else {

                System.out.println(current.value+" l");
                current=current.left;//= new Node(val);
            }
        }
        Node cur=root;
        while(cur.left!=current&&cur.right!=current){
            if(cur.value<val)
                cur=cur.right;
            else
                cur=cur.left;
        }

        if(cur.left==current){
            cur.left=new Node(val);
        }else{
            cur.right=new Node(val);
        }
    }
    public void display(){
        Node temp=root;
        System.out.println("---Left nodes---");
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.left;
        }
        System.out.println("---Right nodes---");
        temp=root;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.right;
        }

    }
    public void traverseInOrder(Node node) {

        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
     public static void main(String args[]){
        BinaryTree tree=new BinaryTree();
       // tree.addRootNode(7);
    /*   // Node newNode=new Node(6);
        tree.addRightNode(6);
       //  Node newNode1=new Node(7);
        tree.addLeftNode(7);
       //  Node newNode2=new Node(17);
         tree.addRightNode(17);
        // Node newNode3=new Node(18);
         tree.addLeftNode(18); */
         tree.addChild(6);
         tree.addChild(4);
         tree.addChild(8);
         tree.addChild(3);
         tree.addChild(5);
         tree.addChild(7);
         tree.addChild(9);



        tree.display();
        tree.traverseInOrder(tree.root);
/*
*          7
*        6   9
*      17 18
*
* */
      /*  tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);*/

     }
}
