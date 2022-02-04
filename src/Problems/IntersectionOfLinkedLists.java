package Problems;


 //* Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

public class IntersectionOfLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      /*  ListNode temp=headB;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }*/

        //5 3 1 6 2 1
        //1 3 2 6 2 1

        ListNode intersectNode=null;

        ListNode pa = headA, pb = headB;

        //1 18 17 45
        //4 18 17 45

        while(pa.val != pb.val){
            System.out.println(pa.val+" headA");
            System.out.println(pb.val+" headB");
            if(pa == null)
                pa = headB;
            else
                pa = pa.next;

            //1 2 3
            //4 2 3

            if(pb == null)
                pb = headA;
            else
                pb = pb.next;

        }
       // System.out.println(pa.val+" here");
        return pb;
    }

    public static void main(String args[]){

        ListNode headA=new ListNode(4);
        ListNode a=new ListNode(18);
        ListNode b=new ListNode(17);
        ListNode c=new ListNode(45);

        headA.next=a;
        a.next=b;
        b.next=c;


        ListNode headB=new ListNode(1);
        ListNode d=new ListNode(18);
        ListNode e=new ListNode(1);
        ListNode i=new ListNode(17);
        ListNode f=new ListNode(45);

        headB.next=d;
        d.next=e;
        e.next=i;
        i.next=f;



        System.out.println(getIntersectionNode(headA,headB).val);

    }
}




