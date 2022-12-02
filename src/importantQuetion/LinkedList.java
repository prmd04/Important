// Java program for reversing the linked list
package importantQuetion;

import java.util.Scanner;

class LinkedList {

    static Node head;
    static Node tail;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        if(head==null){
            tail=node;
            head=node;
        }
        head=node;
    }

    // prints content of double linked list
    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        while(number>0){
            list.insertFirst(number%10);
            number=number/10;
        }

        System.out.println("\nLinked List");
        printList(head);
        System.out.println();
        head=add1(head);
        System.out.println("linked list after adding 1");
        printList(head);

    }
    static Node add1(Node head){
        Node temp=reverse(head);
        Node prev=null;
        Node curr=temp;
        int carry=0;
        while(curr!=null){
            int sum=0;
            if(prev==null){
                sum= curr.data+1;
            }
            else{
                sum= curr.data+carry;
            }
            carry=sum/10;
            curr.data=sum%10;
            prev=curr;
            curr=curr.next;
        }
        if(carry==1){
            Node node=new Node(carry);
            prev.next=node;
        }
        return reverse(temp);
    }
}

