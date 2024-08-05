public class reverselinkedlist {
    public static class Node{
        int data;
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

        public int helper(Node head,int key){
            if (head==null) {
                return -1;
            }
            if (head.data==key) {
                return 0;
            }

            int idx = helper(head.next,key); 
            if (idx==-1) {
                return -1;
            }
            return idx+1;
        }

        public int recSearch(int key){
            return helper(head,key);
        }
     
     public void reverse(){
        Node prev=null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
     }

    
        public static void main(String[] args) {
          reverselinkedlist ll=new reverselinkedlist();
            ll.addFirst(2);
            ll.addFirst( 1);
            ll.addLast(3);
            ll.addLast(4);
            ll.add(2,9);
            ll.print();
            ll.reverse();
            ll.print(); 
         
        }
       
    

}

