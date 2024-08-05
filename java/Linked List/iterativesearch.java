public class iterativesearch {
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
        size++; 
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
         size++; 
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
           if (idx==0) {
             addFirst(data);
             return;
           }

            Node newNode = new Node(data);
            size++;
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

        public int itrSearch(int key){
            Node temp=head;
            int i=0;
            while (temp!=null) {
                // key found case
                if (temp.data==key) {
                    return i;
                }
                temp=temp.next;
                i++;
            }
            // key not found case  
            return -1;
        }
     
 
        public static void main(String[] args) {
           iterativesearch ll=new iterativesearch();
            ll.addFirst(2);
            ll.addFirst( 1);
            ll.addLast(3);
            ll.addLast(4);
            ll.add(2,9);
            ll.print();
            
          System.out.println(ll.itrSearch(3));
        }
       
}


