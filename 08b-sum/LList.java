
//write add string to add to front
//add (index, string)
//find --------> get
//remove(index)
//make a new class llit with a constructor that sets a node = to input node.getnext()
//then must write a has next to return true if there is more stuff in list(check for null)
//then write a next, to move to next node and return value in node before move
public class LList {
    private Node l=null;
    private Node dummy = new Node(-1);
    private int length = 0;

    public void add(int s){
	Node tmp = new Node(s);
	//new
	tmp.setNext(dummy.getNext());
	//from before
	dummy.setNext(tmp);
	//adjust length
	length = length + 1;
    }
    public int  get (int n){
	/*Node tmp = dummy;
	int count;
	
	for (count = 0; count < n && tmp != null; tmp=tmp.getNext()){
	    count += 1;
	}
	return  tmp.getData();
	}*/

	int i = 0;
	Node tmp = dummy.getNext();
	while(i<n){
	    tmp = tmp.getNext();
	    i++;
	}
	return tmp.getData();
    }
    public int length(){
	Node tmp = l;
	int count;
	for (count = 1; tmp != null; tmp=tmp.getNext()){
	    count += 1;
	}
	return count;
    }
    /*
    public void add (int n, String s){
	Node toAdd = new Node(s);
	int count;
	/*Don't need this code because there is always a node before the one we add
	  if (n == 0){
	  toAdd.setNext(l);
	  l = toAdd;
	  }
	
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
	len --;
	}*/

    
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