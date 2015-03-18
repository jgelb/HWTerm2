
//write add string to add to front
//add (index, string)
//find --------> get
//remove(index)

public class LList {
    private Node l=null;
    private Node dummy = new Node(" ");
    private int length = 0;

    public void add(String s){
	Node tmp = new Node(s);
	//new
	tmp.setNext(dummy.getNext());
	//from before
	dummy.setNext(tmp);
	//adjust length
	length = length + 1;
    }
    public Node get (int n){
	Node tmp = dummy;
	int count;
	
	for (count = -1; count < n && tmp != null; tmp=tmp.getNext()){
	    count += 1;
	}
	return tmp;
    }
    public int length(){
	Node tmp = l;
	int count;
	for (count = 1; tmp != null; tmp=tmp.getNext()){
	    count += 1;
	}
	return count;
    }
    
    public void add (int n, String s){
	Node toAdd = new Node(s);
	int count;
	/*Don't need this code because there is always a node before the one we add
	  if (n == 0){
	  toAdd.setNext(l);
	  l = toAdd;
	  }
	*/

	//all the same as before
	Node before = get(n - 1);
	toAdd.setNext(before.getNext());
	before.setNext(toAdd);
	
	//adjust length
	length = length + 1;
    }	    
    
    public void rem(int n){
	//goes to the previous node, and links it to the node 2 spaces away
	//this in effect doesn't delete the node, but just doesn't include it in the list.
	get(n - 1).setNext(get(n-1).getNext().getNext());

    }
    public String toString(){
	String s = "";
	Node tmp;
	// had to modify because of dummy node
	for (tmp = dummy.getNext(); tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
}
