package LinkedList;

public class Linkedlist {
    Node head;    //created only once.
    public void insert(int data){
        Node node=new Node(); //created everytime an element is inserted.
        node.data=data;
        if(head==null){
            head=node;
        }else{
            Node node1;
            node1=head;         //node1 is reference of head. The changes made on node1 will reflect on head too.
            while(node1.next!=null){
                node1=node1.next;
            }
            node1.next=node;
        }
    }

    public void insertAtPosition(int pos,int data){

        int posCount=1;
        Node node=new Node();
        node.data=data;
        Node tempNode=head;
        if(pos==1){
            node.next=head;
            head=node;
            return;
        }
        while(posCount<pos-1){
            posCount++;
            tempNode=tempNode.next;
        }
        //System.out.println(posCount+ " count");
        //System.out.println(tempNode.data+" this1");
        node.next=tempNode.next;
        tempNode.next=node;
        //System.out.println(tempNode.next.next.data+" this");
        //18 17 10

    }

    public void  printTheList(){
        Node node2;
        node2=head;
        while(node2.next!=null){

            System.out.println(node2.data);
            node2=node2.next;

        }
        System.out.println(node2.data); //This print statement is to print the last node.Why separately? well,think of the above while loop and walk with he loop.
    }

    public void deleteAtPosition(int pos){
        Node tempNode;
        tempNode=head;
        int nodeCount=1;
           if(pos==1){
           head=head.next;
           return;
           }
        while(nodeCount<pos-1){
           tempNode=tempNode.next; //18 19 10 29 15
            nodeCount++;
        }
        tempNode.next=tempNode.next.next;
    }

      public void reverseTheList(){

      Node last=head;
      Node first=head;
      Node temp=first.next;
      Node temp2;
      int count=0;
       while(last.next!=null){
             count++;
             last=last.next;
       }
        count++;
        System.out.println(count +" this is count of elements in a list "+last.data);
        first.next=null;
        while(temp.next!=null) {   //29 15 21 18 17 10
            temp2=first;
            first=temp;
            temp=temp.next;
            first.next=temp2;
        }
        temp2=first;
        first=temp;
        first.next=temp2;
        head=first;

    }

    public void sortListBruteForce(){ //Time Complexity is O(n^2)
       // Node node=head;
        Node temp=new Node();
       // temp.data=0;

        for(Node node1=head;node1.next!=null;node1=node1.next ){
            for(Node node2=node1.next;node2!=null;node2=node2.next){
                if(node1.data>node2.data){
                    temp.data=node1.data;
                    node1.data=node2.data;
                    node2.data=temp.data;
                }
            }
        }
    }
    public void sortListMergeSortcall(){
        head=sortListMergeSort(head);
        Node temp=head;
        while(temp.next!=null){

            System.out.println(temp.data);
            temp=temp.next;

        }
        System.out.println(temp.data);
    }
    public Node sortListMergeSort(Node head){
        Node fast=head;
        Node slow=head;
        Node temp=head;
        Node dummy=head;
        if(head==null || head.next==null){
            return head;
        }
        while(fast!=null&&fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        Node left=sortListMergeSort(head);
        Node right=sortListMergeSort(slow);

        return mergeNow(left,right);

        //return head;

    }
    public Node mergeNow(Node l1,Node l2){//12 13     14 15        12 13
        Node temp_sort=new Node();
        Node  temp=temp_sort;
        while(l1!=null&&l2!=null){
            if(l1.data<l2.data) {
                temp.next = l1;
                l1=l1.next;
            }
            else {
                temp.next = l2;
                l2=l2.next;
            }

            temp=temp.next;
        }
        if(l1!=null){
            temp.next=l1;
            l1=l1.next;

        }
        if (l2 != null) {

            temp.next=l2;
            l2=l2.next;
        }

        return temp_sort.next;
    }







}
