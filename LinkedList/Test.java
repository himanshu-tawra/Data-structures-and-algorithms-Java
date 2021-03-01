class LinkedList{
    private Node head;

    private class Node{

        private int data;
        private Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtEnd(int data){
        
        Node node = new Node(data);

        if(this.head == null){
            this.head = node;
        }
        else{
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insertAtBeginning(int data){
        
        Node node = new Node(data);
        
        if(this.head == null){
            this.head = node;
        }
        else{
            node.next = this.head;
            this.head = node;
        }
    }


    public void insertAtNth(int position ,int data){

        
    }

    public void deleteFirst(){

    }
    public void deleteLast(){

    }

    public void deleteNth(int position){

    }
    public void findNode(int key){

    }
    public void findNodeAt(int position){

    }

    public void findLastNode(){

    }
    public int getSize(){
        return 0;
    }

    public int length(){
        Node current = this.head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void show(){
        Node current = this.head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}

public class Test{
    public static void main(String[] agrs){

        LinkedList list = new LinkedList();
        list.insertAtBeginning(5);
        list.insertAtEnd(6);
        list.insertAtBeginning(4);
        list.show();

    }
}