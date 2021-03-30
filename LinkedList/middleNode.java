class Linkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;
    
    public void insertAtEnd(int data){
        Node temp = new Node(data);

        if(head == null){
            head = temp;
            return;
        }
        else{
            Node currentNode = head;

            while(currentNode.next != null){
                currentNode = currentNode.next;
            }

            currentNode.next = temp;
        }
    }

    public int lengthOfList(){
        int counter = 0;
        Node curreNode = head;

        while(curreNode.next != null){
            curreNode = curreNode.next;
            counter++;
        }

        return counter;
    }

    public int middleNode(){

        int len = lengthOfList();
        Node curreNode = head;
        for(int i = 0; i < len/2; i++){
            curreNode = curreNode.next;
        }
        return curreNode.data;

    }

    public int middleNodeOfList(){

        if(head == null){
            return 0;
        }
        Node slow = head;
        Node fast = head.next;


        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;        
        }

        return slow.data;
    }
    public static void main(String[] args){

        Linkedlist list = new Linkedlist();

        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.insertAtEnd(25);

        int middle = list.middleNode();

        System.out.println("Middle node : " + middle);

        int middle2 = list.middleNodeOfList();

        System.out.println("Middle node : " + middle2); 

    }
}
