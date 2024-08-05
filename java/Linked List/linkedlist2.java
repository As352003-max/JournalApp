  import java.util.LinkedList;;
  public class linkedlist2 {
    public static class Node{
        int data;
        // next is an refrence variable it gives refrence to another node and establishes an link between them    
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    // add element at first

    public void addFirst(int data){
       
       // Step1. create new node
       Node newNode=new Node(data);
       
        if (head==null) {
            head=tail=newNode;
            return;
        }

        

        // Step2. new node next will point previous head
        newNode.next=head;

        // Step3. head will be the new node creaated
        head=newNode;
    }

    // add element at last
    public void addLast(int data){
       
        // Step1. create new node
        Node newNode=new Node(data);
        
         if (head==null) {
             head=tail=newNode;
             return;
         }
 
         
 
         // Step2. new node next will point previous head
         tail.next=newNode;
 
         // Step3. head will be the new node creaated
         tail=newNode;
     }
 
        public static void main(String[] args) {
            LinkedList<Integer> ll=new LinkedList<>();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);

            System.out.println(ll);
        }
       
        
    }
    


