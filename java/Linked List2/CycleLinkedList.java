public class CycleLinkedList {
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

        public void deleteNthnodeFromEnd(int n){
            // calculate size
           
            int sz=0;
            Node temp=head;
            while (temp!=null) {
                temp=temp.next;
                sz++;
            }
            if(n==sz){
                head=head.next;
                return;
            }
            // sz-n

            int i=1;
            int iToFind=sz-n;
            Node prev=head;
            while (i<iToFind) {
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;
        }

        // slow-fast  approach
        public Node findMid(Node head){
            Node slow= head;
            Node fast= head;

            while (fast!=null && fast.next!=null) {
                // +1
                slow=slow.next;
                // +2
                fast=fast.next.next;
            }
            // slow is my midNode
            return slow;
        }

        public boolean checkPalindrome(){
            if (head==null||head.next==null) {
                return true;
            }
            //step1- find mid
            Node midNode = findMid(head);   

            //step2- reverse second half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while (curr!=null) {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
        //    right half head
            Node right = prev;
            Node left = head;

            //step3- check left half and right half
            while (right!=null) {
                if (left.data != right.data) {
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
        }

        // Floyd's Cycle Finding algorithm

        public static boolean isCycle(){
            Node slow = head;
            Node fast = head;

            while (fast!=null && fast.next != null) {
                // 1 step move
                slow = slow.next;
                // 2 step move
                fast = fast.next.next;
                if (slow==fast) {
                    // cycle exists
                    return true;
                }
            }
            // cycle doesn't exist
            return false;
        }
        public static void main(String[] args) {
            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next= head;
            // 1->2->3->1
            System.out.println(isCycle());
        }

    
}