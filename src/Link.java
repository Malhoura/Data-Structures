
public class Link {
	public int data;
	public Link next;
	public Link previous;


	public Link(int data){
		this.data =data;
	}
	
	public Link(Link previous, int data, Link next){
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	
}
