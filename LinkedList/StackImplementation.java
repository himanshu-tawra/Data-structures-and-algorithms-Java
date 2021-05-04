public class StackImplementation {

    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head = null;

    public void push(int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{

            head = head.next;
        }
    }

    public void peek(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(head.data);
        }

    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void display(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        StackImplementation stk = new StackImplementation();
        stk.push(5);
        stk.push(10);
        stk.push(15);
        stk.push(20);
        stk.peek();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();
    }
}
