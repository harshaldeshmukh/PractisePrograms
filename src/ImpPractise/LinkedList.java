package ImpPractise;

public class LinkedList {
    Node head;
    static  class Node{
        int val;
        Node nextnode;
        public Node(int val) {
            this.val = val;
        }
    }

    public   void  pushNode(int num){
        Node newNode= new Node(num);
        newNode.nextnode=head;
        head=newNode;

    }

    public  void printNode(){
        Node temp = head;
        while(temp!=null)
        {
            int vales= temp.val;
            System.out.println(vales);
            temp= temp.nextnode;

        }
    }

    public int getLen(){
        int len=0;
        Node temp= head;
        while (temp!=null){
            len++;
            temp= temp.nextnode;
        }
        return  len;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();


        list.pushNode(1);
        list.pushNode(2);
        list.pushNode(3);
        list.pushNode(4);
        list.pushNode(5);
        list.printNode();
        System.out.println("------------------  " + list.getLen());


    }
}
