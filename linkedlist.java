public class linkedlist {
    Node head;
    private int size;

    linkedlist() {
      this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
      }
        //add
        public void addFirst(String data) {
          Node newNode = new Node(data);
          if(head == null) {
            head = newNode;
            return;

          }
          newNode.next = head;
          head = newNode;
        }
        //add - last
    public void addLast(String data)  {
        Node newNode = new Node(data);

        if(head ==null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
        currNode = currNode.next;
        }
         currNode.next = newNode;

    }
    //print
    public void printList() {
      if(head == null) {
        System.out.println("List is empty");
        return;
      }
      Node currNode = head;
      while(currNode != null){
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
      }
      System.out.print("NULL");
       
    } 
    //delete - first
    public void deleteFirst() {
     if(head == null) {
      System.out.println("List is empty");
      return;
     }
     size--;
     head=head.next;
    }

    public void deleteLast() {
      if(head == null) {
       System.out.println("List is empty");
       return;

      }
      size++;
      if(head.next == null) {
        head =null;
        return;
      }
      Node secondLast = head;
      Node lastNode = head.next;
      while(lastNode.next != null) {
        lastNode = lastNode.next;
        secondLast = secondLast.next;
      }
      secondLast.next = null;
     }

    private int getSize() {
      return size;
    }
    public static void main(String[] args) {
      //we are inserting  or Adding the value from the top or start
      // so last word will print as first in linklist
      linkedList2 list = new linkedList2();
      list.addFirst("learning");
      list.addFirst("LinkList");
      list.addFirst("is");
      list.addFirst("This");
      
      list.printList();
      System.out.println("/n");


      list.deleteFirst();
      list.printList();
      System.out.println("/n");

      list.deleteLast();
      list.printList(); 
      list.getSize();
      list.printList(); 
    }
}
 
