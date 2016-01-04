
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
		
		return first == null;
			
	}
	
	
	public ListIterator getIterator() // return iterator
	{
	return new ListIterator(this); // initialized with
	}								// this list
	
	public void displayList(){
		Link current = first;
		if(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}


