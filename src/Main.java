class Main{
    public static  void main(String[]args){

        Node head=new Node(10);
        head.next=new Node(30);
        head.next.next=new Node(45);
        head.next.next.next=new Node(60);
        head.next.next.next.next=new Node(75);

        printList(head);
        System.out.println(search(head,60));
       Node xm=insertAtBegin(head,11);
        printList(xm);
        insertAtEnd(xm,43);
        printList(xm);





    }

    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }


    }
    public static int search(Node head, int item){
        int pos=1;
        Node curr=head;
        while(curr!=null) {
            if(curr.data==item){
                return pos;
            }
            else{
                pos++;
                curr=curr.next;

            }

        }
        return -1;
    }

    public static Node insertAtBegin(Node head,int x){
        Node temp=new Node(x);
       temp.next=head;
       return temp;

    }

    public static Node  insertAtEnd(Node head,int y){
        Node temp=new Node(y);
        if(head==null){
            return temp;

        }

        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;






    }


    public static Node deleteBegin(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        return head.next;



    }


    public static Node  deleteEnd(Node head){
        if(head==null){return null;}
        if(head.next==null){return null;}
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;

        return head;

        }




        public static Node  insertAtPos(Node head,int pos,int m){
        Node temp= new Node(m);
        Node curr=head;

        for(int i=0;i<pos-2 && curr!=null;i++){
            curr=curr.next;

        }
        temp.next=curr.next;
        curr.next=temp;

        return head;






        }






}








class Node{
    int data;
    Node next;


    Node(int d){
        data=d;
    }
}
// ll is a linear data structure
// ability to work in fragmented memory.(it does not pre-allocates the memory like arrays).
// int arr[]=new int[6]; size is fixed and pre allocated
// insertion and deletion is costly in middle of the array
//idea is to drop the contigous memory requirements so the insertion and deletion can be effectively happen at the middle also

