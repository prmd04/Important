package LinkedList;
/*Here we create doubly linked list */
public class DLL {
    private Node head;// we create only head which value at start is null
    // Below is the first method to insert at first place in doubly linke list
    public void insertFirst(int value){// take integer value as parameter
    Node node=new Node(value);// create a node becouse this node going to added
    node.next=head;// the next of node is head off couse
    node.prev=null;// previous is null becouse its at first place
    if(head!=null){ // if the head is already prasent in the linked list
        head.prev=node;
    }
    head=node;// make it head becouse its first in linked list

    }

    //Here the method for display
    // its pretty simple take a node which travel from head to end and print it
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value+"-->");
            node=node.next;
        }
        System.out.println("END");
    }
    // Reverse the linked list
    public void reverse(){
        Node last=head;// take a node last which go to the last position
        while(last.next!=null){// if last.next not null
            last=last.next;// then upadate it
        }
        while(last!=null){ // now traverse back until its null
            System.out.print(last.value+"<--");//every time print value
            last=last.prev;//every time one step back
        }
        System.out.println("START");
    }

    // here the method for insert the last
    public void insertLast(int value){ // take value as parameter
        Node node=new Node(value);//create a new node
        if(head==null){ // if no item prasent in linked list
            node.prev=null;//then node prev is null
            head=node;// make it head becouse initially the linked list was
            //empty so the node is first element thats why make it head;
        }
        Node last=head;    // we have to reach the last to delete node
        while(last.next!=null){
            last=last.next;// this can reach us at last
        }
        node.next=null;// node next always null becouse its last node
        node.prev=last;// previous = last
        last.next=node;// last next is node


    }

    //Here the method to insert after the value
    public void insert(int after,int val){//take two para one for after and
        //another for value
        Node temp=head;  // we want that value which after we insert
        while(temp.value!=after){ // this gives that value
            temp=temp.next;
        }
        Node node=new Node(val);// Create the new node
        node.next=temp.next;// node next is temp next now
        node.prev=temp;// node prev is temp now
        if (temp.next!=null){ // if temp next not null
            temp.next.prev=node;// only then do this
        }
        temp.next=node;// temp.next node now
    }
    // Here the method which delete the value after
    public void delete(int after){// take a parameter to know which value is deleted
        Node temp=head;// this can gives the position
        while(temp.value!=after){
            temp=temp.next;
        }
        if(temp.next==null){ // there is no value after this print belows line
            System.out.println("No item found for deletion");
            return;
        }

        temp.next=temp.next.next; // whatever the temp.next.next now the next of temp
        if(temp.next!=null) {// only the temp.next not null
            temp.next.prev=temp;// then do this
        }
    }

    // Here is the method to delete first

    public int deleteFirst(){// returning the deleted value
        int val=head.value;// return value stored in val variable
        head=head.next;// now head is shifting one ahead
        head.prev=null;// and previous value is gone now
        return val;// returning the value
    }

    // here the method for delete the last node
    public int deleteLast(){ // again return the deleted value;
        if(head.next==null){ // if there is only one element in the list
            deleteFirst();// called the delete first method
        }
        Node last=head;// here we tryint to reach last position
        while(last.next.next!=null){
            last=last.next;
        }
        int val=last.next.value;// stored for returning the value
        last.next=null;// delete the value
        return val;// return here

    }

  private class Node { // Here the class node
      int value;// in that class we have int value
      Node next;// Node next which pointing to the next Node
      Node prev;// And the Node prev which pointing the previous Node

      Node(int value) {  // First constructor which take only int value
          this.value = value;
      }

      Node(int value, Node next, Node prev) { // another constructor which
          this.value = value;// take all the three values
          this.next = next;
          this.prev = prev;
      }
  }

}
