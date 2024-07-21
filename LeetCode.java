import java.util.*;
public class LeetCode {//implementation of Linked List
int size;
Node head;
public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//add-first
public void addFirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    size++;
    newNode.next=head;
    head=newNode;
}
//add-last
public void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    size++;
    Node currNode=head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
        currNode.next=newNode;
    }
    //print
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
    }
//delete first
public void deleteFirst(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    size--;
    head=head.next;
}
//delete last
public void deleteLast(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    size--;
    if(head.next==null){
        head=null;
        return;
    }
    size--;
    Node secondlastNode=head;
    Node lastNode=head.next;
    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondlastNode=secondlastNode.next;

    }
    secondlastNode.next=null;

}
//size
public int size(){
    return size;
}
    public static void main(String args[]){
        LeetCode LinkedList=new LeetCode();
        LinkedList.addFirst(1);
        LinkedList.addFirst(2);
        LinkedList.addFirst(3);
        LinkedList.addLast(4);
        LinkedList.addLast(5);
        LinkedList.printList();
        System.out.println();
        LinkedList.deleteFirst();
        LinkedList.deleteLast();
        LinkedList.printList();
        System.out.println();
        int s=LinkedList.size();
        System.out.println(s);
    }

        
    }

