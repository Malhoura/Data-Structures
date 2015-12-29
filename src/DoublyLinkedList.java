
public class DoublyLinkedList {
	
	public Link first;
	public int num;
	
	public DoublyLinkedList(){
		first = null;
		num= 0;
	}
	
	
	
	public void addFirst(int data){
		if(first == null)
		first = new Link(null, data, null);
		
		else{
			Link newLink = new Link(null, data, first);
			first.previous = newLink;
			first = newLink;
		}
		num++;
	}
	
	public void addLast(int data){
		if(first == null)
			first = new Link(null, data, null);
		else{
			Link current = first;
			while(current.next != null){
				current = current.next;
			}
			Link newLink = new Link(current, data, null);
			current.next = newLink;
			
		}
		num++;
	}
	
	public void deletefirst(){
		if(first == null)
			return;

		first = first.next;
		first.previous = null;
		num--;
	}
	
	public void deleteLast(){
		if(first == null) return;
		
		if(first.next == null){
			first = null;
			num--;
			return;
		}
		
		Link current = first;
		while(current.next.next != null){
			current =current.next;
		}
		current.next=null;
		num--;
	}
	
	public void display(){
		Link current = first;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFirst(5);
		dll.addFirst(10);
		dll.display();
		dll.addLast(20);
		System.out.println("____________");
		dll.display();

	}

}
