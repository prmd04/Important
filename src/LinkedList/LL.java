package LinkedList;
/*Here we construct the custome linked list */

public class LL {       // class LL
    private static Node head;
    private static  Node tail;


 // Add the element at the first position of the linked list
    public void insertFirst(int val){
        Node node=new Node(val);    // make a node
        node.next=head;// pointing the previous head
        head=node;

        if(tail==null){ // if there is only one element in the linked list the head and tell both is same
            tail=head;

        }

    }
    // here the method which display the element in the linked list
    public void display() {
        Node temp=head;
        while (temp !=null) {
            System.out.print(temp.value + "-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    // Below is the code for the Inter last element in the link list
    public void insertLast(int value){
        Node node=new Node(value);// so we create the new node
        if(tail==null){           // if there is no value in the link list means list is empty then called insert fist
            insertFirst(value);
            return;
        }
        tail.next=node;// we connect the node here
        tail=node;// now make the tail is node
    }
    public void insert(int value,int index){ // we take two parameters one for value and one for index
        if(index==0){     // if index is 0 then list is empty called the insertfirst
            insertFirst(value);
            return;
        }

        Node temp=head;// make the node who reached behind the index
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next); // node and node.next collectively provide
        temp.next=node;
    }

    // here we start the delete the element now
        public int deleteFirst(){ // here we delete the first element
        int val=head.value;// we return the delete item so stored into the val
        head=head.next;// simple head now head.next
        if(head.next==null){ // if the only element in the linked list them tail also null
            tail.next=null;
        }

        return val;// return now
        }

        // now we delete the last element in the linked list
        public int deleteLast(){
        int val=tail.value; // we have to return thats why we take val
        if(head==tail){
            deleteFirst();
        }
        Node temp=head; // we have to go behind the tail that why we take temp here and assign it head
        while(temp.next.next!=null){// if temp.next=tail then temp.next.next=null
            temp=temp.next;
        }
        temp.next=null;// temp.next null means the delete last item
        tail=temp;//now the tail is temp
        return val;// return the val
        }

        // now we delete the particular index element
        public int delete(int index){ // we take index in the parameter
        if(index==0){ // if index==0 then we delete the first one so called deletefirst
            deleteFirst();
        }
        Node temp=head;// here we trying to reach behind the index
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        int val=temp.next.value;// here we stored the temp.next value for returning purpose
        temp.next=temp.next.next;// the new next of temp is next next
        return val;// return val;
        }

        // here we find the element
        public int find(int value){
        Node temp=head;
        int i=0 ;
        while(temp!=null){
            if(temp.value==value){
                return i;
            }
            else{
                temp=temp.next;
            }
            i++;
        }
        return -1;
        }

      static private class Node {
        int value; //  the node we have two thing first is value
         Node next; //  and the second is address of next node;

        public Node(int value) { // here we take value and the address
            this.value = value;
            this.next = next;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    /*Questions On Linked List */

    public void removeDup(){
        Node node=head;  // make node equall to head
        while(node.next!=null){ // until the next value is null
            if(node.value==node.next.value){ // if the value is same
                node.next=node.next.next; // then change node.next to
                // node.next.next
            }
            else{ // else upadate the node
                node=node.next;
            }
        }
        tail=node; // at last node is tail and next of tail is null
        tail.next=null;
    }
    public static LL mergeTwoSortedll(LL first,LL second){

        Node head1=first.head;
        Node head2=second.head;
        LL ans=new LL();
        while(head1!=null && head2!=null){
            if(head1.value <head2.value){
                ans.insertLast(head1.value);
                head1=head1.next;
            }
            else{
                ans.insertLast(head2.value);
                head2=head2.next;
            }
        }
        while(head1!=null){
            ans.insertLast(head1.value);
            head1=head1.next;
        }
        while(head2!=null){
            ans.insertLast(head2.value);
            head2=head2.next;
        }
        return ans;
    }
    /* 206. Reverse Linked List */
    public static  Node  reverseList(Node head) {
        /*Take three node first set at null second at head and thired
        at head next
        1.we have do only one thing the faces turn like head next now is
           prev the face turn and go on until prasent got null simple*/
       Node prev = null;
        Node prasent = head;
        Node next = prasent.next;

        while (prasent != null) {
            prasent.next = prev;
            prev = prasent;
            prasent = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }
    /*public void palindrom(Node head) {
        Node lav=head;
        LL ans = reverseList(head);
        ans.display();
        first.display();
        if(ans==first){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }*/
    public static Node add1(Node head){
        return head;
    }
}
