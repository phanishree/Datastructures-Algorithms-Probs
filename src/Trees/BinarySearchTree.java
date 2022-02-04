package Trees;

import java.util.Scanner;

class NodeOfTree{
    int value;
    NodeOfTree left;
    NodeOfTree right;
    public NodeOfTree(int val){
        value=val;
        left=right=null;
    }
    public NodeOfTree( ){
        value=0;
        left=right=null;
    }
}
public class BinarySearchTree {

    public static void main(String args[]){
        BinarySearchTree bst=new BinarySearchTree();
        NodeOfTree root=new NodeOfTree();
        if(root.value==0){
            root= new NodeOfTree(5);
        }
        bst.addNode(4,root);
        bst.addNode(6,root);
        bst.addNode(1,root);
        System.out.println(root.value+" "+root.left.value+" "+root.right.value);


        System.out.println("This is In-Order Traversal of a tree");
        bst.inorderTraversal(root);

        System.out.println();

        System.out.println("This is Post-Order Traversal of a tree");
        bst.preOrderTraversal(root);

        System.out.println();

        System.out.println("This is Post-Order Traversal of a tree");
        bst.postOrderTraversal(root);

        System.out.println();
        System.out.println("Enter the value you want ot search in a tree");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        NodeOfTree afterSearch=bst.searchKey(root,key);
        if(afterSearch!=null){
            System.out.println("Key found in a tree");
        }else{
            System.out.println(key+" Key not found in a tree");
        }

        bst.deleteNodeInaNode(5,root);
    }


    public void addNode(int val,NodeOfTree root){

        if(root.value==0){
           root= new NodeOfTree(val);
        }else{
            NodeOfTree current=root;
            while(current.left!=null&&current.right!=null){
                if(val<current.value){
                    current=current.left;
                }else if(val>current.value){
                    current=current.right;
                }
            }
            if(val<current.value){
                current.left=new NodeOfTree(val);
            }else if(val>current.value){
                current.right=new NodeOfTree(val);
            }

        }
    }

    public void inorderTraversal(NodeOfTree node){

        if(node==null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.value+" ");
        inorderTraversal(node.right);
    }

    public void preOrderTraversal(NodeOfTree node){

        if(node==null){
            return
;        }

        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

    public void postOrderTraversal(NodeOfTree node){

        if(node==null){
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+" ");

    }

    public NodeOfTree searchKey(NodeOfTree root,int key){

        NodeOfTree checkingNodes=root;

        while(checkingNodes!=null){
            if(key<checkingNodes.value){
                checkingNodes=checkingNodes.left;
            }else if(key>checkingNodes.value){
                checkingNodes=checkingNodes.right;
            }else{
                return checkingNodes;
            }
        }
        return null;
    }

    public void deleteNodeInaNode(int val,NodeOfTree node){

        if(node==null){
            return;
        }

        if(node.value==val){
            if(node.right!=null){
                NodeOfTree storeNode=node.right.left;
                node.right.left=node.left;
                node.right=node.right.right;
                node.left=storeNode;
                inorderTraversal(storeNode);
                return;

            }

        }else{
            if(val<node.value)
            deleteNodeInaNode(val,node.left);
            else
            deleteNodeInaNode(val,node.right);
        }


    }
}
