
//write add string to add to front
//add (index, string)
//find --------> get
//remove(index)

public class LList {
    private Node l=null;
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }
    public Node find (int n){
	Node tmp = l;
	int count;
	for (count = 1; count < n && tmp != null; tmp=tmp.getNext()){
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
    
    public void insert (int n, String s){
	Node toAdd = new Node(s);
	int count;
	if (n == 0){
	    toAdd.setNext(l);
	    l = toAdd;
	}
	else{
	    Node before = find(n - 1);
	    toAdd.setNext(before.getNext());
	    before.setNext(toAdd);
	    
	}
	    
    }
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
}
