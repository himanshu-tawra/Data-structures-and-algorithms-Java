class LinkedList{

    class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    private Node head;

    public void insertAtBeginning(int data){

        Node temp = new Node(data);
        if(head == null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }

    public void insertAtEnd(int data){
        
        Node temp = new Node(data);

        if(head == null){
            head = temp;
        }
        else{
            Node currenNode = head;
            while(currenNode.next != null){
                currenNode = currenNode.next;
            }

            currenNode.next = temp;
        }

    }

    public void insertAtIndex(int data,int index){

        Node temp = new Node(data);

        if(index == 0){
            temp.next = head;
            head = temp;
        }

        else{
            Node currentNode = head;
            Node previous = null;
            int counter = 0;
            while(currentNode != null && counter < index){
                previous = currentNode;
                currentNode = currentNode.next;
                counter++;

            }

            temp.next = currentNode;
            previous.next = temp;
        }
    }

    public void deleteFront(){
        if(head == null){
            System.out.println("Linkedlist is empty...!");
        }
        else{
            head = head.next;
        }
    }

    public void deleteEnd(){
        if(head == null){
            System.out.println("Linkedlist is empty...!");
        }
        else{
            Node currenNode = head;
            Node previousNode = null;

            while(currenNode.next != null){
                previousNode = currenNode;
                currenNode = currenNode.next;
            }

            previousNode.next = null;

        }
    }

    /*
    public void deleteKey(int data){

        if(head.data == data){
            head = head.next;
        }
        else{
            Node previous = null;
            Node currentNode = head;

            while(currentNode.data != data){
                
                previous = currentNode;
                currentNode = currentNode.next;
                if(currentNode == null){
                    System.out.println("Key not found");
                    return;
                }
            }
            previous.next = currentNode.next;
            

        }
    }
*/
    public void show(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
   
}

class Test{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(25);
        list.show();

        list.insertAtBeginning(12);
        
        list.show();
        list.insertAtBeginning(6);
        list.show();
        list.insertAtIndex(1,0);
        list.show();
        list.insertAtIndex(500, 50);
        list.show();
        list.insertAtIndex(4, 3);
        list.show();
        list.insertAtEnd(50);
        list.show();
        list.insertAtEnd(100);
        
        list.show();
    }
}