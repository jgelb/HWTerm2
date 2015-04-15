import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
        int i = 0;
	int min = n.getPriority();
	while (i < l.size() ){
	    if( min > l.get(i).getPriority() ){
	        i += 1;
	    }
	    else {
		l.add(i,n);
		return;
	    }
	}
	l.add(n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
    public String toString(){
	String s = "[";
	int i = 0;
	while(i<l.size()){
	    s= s + l.get(i) + ",";
	    i++;
	}
	return s+"]";
    }
	
}










