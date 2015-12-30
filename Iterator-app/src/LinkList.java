
public class LinkList {
	
	public Link first;
	
	public LinkList(){
		first = null;
	}
	
	public Link getFirst(){
		
		return first;
	}
	
	public void setFirst(Link f){
		first = f;
	}
	
	public boolean isEmpty(){
		
		return first==null;
			
	}
	
	public ListIterator iteratorList(){
		
		return new ListIterator(this);
	}
	
	public void displayList(){
		Link current = first;
		if(current != null){
			current.displayLink();
			current = current.next;
		}
	}
}


