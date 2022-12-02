package LinkedList;

public class CLL {
    /*Initially head and tail both are null */
    private Node head;
    private Node tail;

    /*Make the private class Node that contain int value and the
       address of next Node*/
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    /*Insert first means in circular linked list is actually putting the
       value after the tail.*/
    public void insert(int value) {
        Node node = new Node(value);
        node.next = head;
        // the condition when the linked list is empty
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;

    }

    /*Display the circular linked list */
    public void display() {
        Node temp = head;// assing temp with head means first element
        if (head != null) {// only when linked list is not empty
            do { // do this thing
                System.out.print(temp.value + "->");
                temp = temp.next;
            } while (temp != head);// until the temp is not again head;
        }
        System.out.println("START");
    }
    /*Now try to delete the node */
    public void delete(int value){ // take value as parameter
        Node node=head; // set node equal to head
        if(node.value==value){ // if head is to be deleted
            tail.next=head.next; // tails.next is prasent head.next
            head=head.next;// and now head will change
        }
        do{
            Node n=node.next; // take n node which is one step ahead than the
            // the node
            if(n.value==value){ // if the value match then node next is n next
                // means node next is jumping one step
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }

}