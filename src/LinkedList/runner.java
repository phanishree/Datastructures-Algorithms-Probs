package LinkedList;

public class runner {
    public static void main(String args[]){
            Linkedlist list=new Linkedlist();
            list.insert(18);
            list.insert(17);
            list.insert(10);
            // list.printTheList();

            list.insertAtPosition(1,29);
            list.insertAtPosition(2,15);
            list.insertAtPosition(3,21);
            //list.printTheList();

              //list.deleteAtPosition(2);
              //list.deleteAtPosition(3);
              //list.deleteAtPosition(1); //deleting at first place is kind of a special case. check out the code.
              //list.printTheList();
              //list.reverseTheList();
              //list.printTheList();
              //System.out.println(list);
              // list.sortListBruteForce();
               list.sortListMergeSortcall();
              //list.printTheList();



    }
}
