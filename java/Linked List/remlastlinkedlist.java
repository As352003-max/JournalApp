public class remlastlinkedlist {
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
    public static int size;
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
  
  

    // add element in middle
         public void print(){

            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next; 
            }
          System.out.println("null");
        }

        public void add(int idx, int data){
            Node newNode = new Node(data);
            Node temp =head;
            int i=0;

            while (i<idx-1) {
                temp =temp.next;
                i++;
            }

            // i=idx-1; temp->prev
            newNode.next=temp.next;
            temp.next=newNode;
         }

        public int removeFirst() {
            if (  size == 0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
        
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        
        public int removeLast() {
            if (size == 0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
        
            Node prev = head;
            while (prev.next != tail) {
                prev = prev.next;
            }
        
            int val = tail.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
        
 
        public static void main(String[] args) {
           remlastlinkedlist ll=new remlastlinkedlist();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            ll.add(2,9);
            ll.print();

            ll.removeFirst();
            ll.print();

            ll.removeLast();
            ll.print();
            System.out.println(size);
            
        }
}
