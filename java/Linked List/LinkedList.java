public class  LinkedList {
  
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

    public void print(){

        if (head==null) {
            System.out.println("LL is empty");
            return;
        }
    
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;  
        }
        System.out.println("NULL");

    }


 
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.print();
            ll.addFirst(2);
            ll.print();
            ll.addFirst(1);
            ll.print();
            ll.addLast(3);
            ll.print();
            ll.addLast(4);
            ll.print();  

            System.out.println(ll);
        }
       
        
    }
    




