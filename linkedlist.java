class linkedlist{
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
        public void addfirst(int data){
          Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
             }
             newNode.next=head;
             head=newNode;
             }
         public void addlast(int data){
         Node newNode=new Node(data);
         if(head==null){
            head=tail=newNode;
            return;
         }
         tail.next=newNode;
         tail=newNode;
        }
        public void print(){
            if(head==null){
                System.out.println("empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println();
        }
        public void add(int idx,int data){
            if(idx==0){
                addfirst(data);
            }
            Node newNode=new Node(data);
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            }
        
public static void main(String[] args) {
    linkedlist ll=new linkedlist();
    ll.print();
    ll.addfirst(2);
    ll.print();
    ll.addfirst(1);
    ll.print();
    ll.addlast(3);
    ll.print();
    ll.addlast(4);
    ll.print();
    ll.add(2,9);
    ll.print();
}
    }
