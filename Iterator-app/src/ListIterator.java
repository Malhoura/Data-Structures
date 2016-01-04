
public class ListIterator {
	
	private Link current;
	private Link previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list){
		ourList = list;
		reset();
	}
	
	public void reset(){
		current = ourList.getFirst();
		previous = null;
	}
	
	public void nextLink(){	
		previous = current;
		current = current.next;
}
	
	public boolean atEnd(){
		return (current.next == null);
	}
	
	public Link getCurrent(){
		return current;
	}
	
	public void insertAfter(long d){
		
		Link newLink = new Link(d);
		
		if(ourList.isEmpty()){
			ourList.setFirst(newLink);
			current = newLink;
		}
		else{	
		newLink.next = current.next;
		current.next = newLink;
		nextLink();
		}
	}
	
	public void insertBefore(long d){
		Link newLink = new Link(d);
		
		if(previous == null){
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		}
		else{
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
		
	}
	
	public long deleteCurrent(){
		long value = current.data;
		if(previous == null){ 				//beginning of list
			ourList.setFirst(current.next);
			reset();
		}
		else{
			previous.next = current.next;
			if(atEnd())
				reset();
			else
				current = current.next;
		}
		return value;
			
	}
	
	
	
}