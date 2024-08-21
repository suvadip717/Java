class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    // Print the Linkedlist function 
    public void printList(){
        if (head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println();
    }

    // Add element at the first of Linkedlist 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // Add element at the last of Linkedlist 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next=newNode;
    }

    // Delete element at the first of Linkedlist 
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    // Delete element at the last of Linkedlist 
    public void deleteLast(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node lastNode = head.next;
        Node secondLast = head;
        while ( lastNode.next!= null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Reverse the Linkedlist
    public void reverseList(){
        if (head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse the Linkedlist using recursion
    public Node reverseRecursive(Node head){
        if(head==null || head.next ==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Main Function
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.printList();

        list.addLast("Pen");
        list.printList();

        list.addFirst("is");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.head=list.reverseRecursive(list.head);
        list.printList();

        list.reverseList();
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

    }
}
