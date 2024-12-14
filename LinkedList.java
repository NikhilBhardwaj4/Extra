package extra;

public class LinkedList {
    public static  class LL{
         private Node head;
         private Node tail;
       int size;
        public LL(){
            this.size=0;
        }

        public void insertFirst(int val){
            //Node temp = head;
            Node node = new Node(val);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }

        }
        public void insertLast(int val){
            if(tail==null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next=node;
            node=tail;
        }
        public void insertIndex(int val,int index){
            if(index==0){
                insertFirst(val);
                return;
            }
            if(index==size){
                insertLast(val);
                return;
            }
            Node temp = head;
            for (int i = 1; i < index; i++) {
                    temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next =node ;
        }

        public void deleteFirst(){
            head=head.next;
            if(head==null){
                head=tail;
            }
        }

        public Node getIndex(int index){
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        public void deleteLast(){

            Node secondlast = getIndex(size-2);
            tail=secondlast;
            tail.next=null;
        }

        public void display(){
            Node temp = head;
            System.out.print("Start->");
            while(temp!=null){
                System.out.print(temp.value+"->");
            temp = temp.next;
            }
            System.out.print("End");

        }

        private static  class Node{
            Node next;
            int value;

            public Node(int value){
                this.value=value;
            }
            public Node(int value , Node next) {
                this.value = value;
                this.next = next;
            }

        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(10);
        list.insertIndex(7,1);
        list.display();
        System.out.println();
        //list.deleteFirst();
        list.deleteLast();
        list.display();
    }
}
