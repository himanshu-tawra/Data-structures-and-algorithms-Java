public class SinglyLinkedlist{
	
	private NodeList head;
	
	private static class NodeList{
		private int data;
		private NodeList next;
	
		public NodeList(int data){
			this.data = data;
			this.next = null; 
			
		}
	
	}

	public void display(){
		
		NodeList current = head;
		while(current != null){
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args){
		
		SinglyLinkedlist sll = new SinglyLinkedlist();
		sll.head = new NodeList(1);
		NodeList second = new NodeList(2);
		NodeList third = new NodeList(3);
		sll.head.next = second;
		second.next = third;

		sll.display();
		
		
	}
	


}