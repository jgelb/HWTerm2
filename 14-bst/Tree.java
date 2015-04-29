import java.util.*;
import java.io.*;
public class Tree{
    private Node root;
    public Tree(){
	root = null;
    }
    public Tree(Node n){
	root = n;
    }
    public void insert(int i){
	Node t = root;
	Node piggy = t;
	if(t == null){
	    t = new Node(i);
	}
	while(t!=null){
	    piggy = t;
	    if(t.getData()<i){
		t=t.getRight();
	    } else if(t.getData()>i) {
		t=t.getLeft();
	    } else {
		return;
	    }
	}
	if(piggy.getData() < i){
	    piggy.setRight(new Node(i));
	}else {
	    piggy.setLeft(new Node(i));
	}
    }
    public Node search(int i){
	Node t = root;
	while(t!=null){
	    if(t.getData() < i){
		t = t.getRight();
	    }else if(t.getData()>i){
		t=t.getLeft();
	    }else {
		return t;
	    }
	}
	return null;
    }
    public Node rSearch(Node t, int i){
	if(t==null){
	    return null;
	}
	if(t.getData() < i){
	    return rSearch(t.getRight(),i);
	} else if (t.getData() > i){
	    return rSearch(t.getLeft(),i);
	}
	return t;
    }
    public Node rSearch(int i){
	return rSearch(root,i);
    }
    //not really sure how to format a tree but this atleast prints everything
    public String traverse(Node t){
	if(t == null){
	    return "";
	}
	return  traverse(t.getLeft()) +"," + t.getData() +"," + traverse(t.getRight());
    }
    public String toString(){
	return traverse(root);
    }
    public String ascend(Node t){
	if(t == null){
	    return "";
	}
	return ascend(t.getLeft()) + t.getData() + ", " + ascend(t.getRight());
    }
    public String ascend(){
	return ascend(root);
    }
    public static void main(String[] args){
	Random rnd = new Random();
	Node r = new Node(40);
	Tree b = new Tree(r);
	for(int i=0;i<10;i++){
	    b.insert(10*rnd.nextInt(10));
	}
	System.out.println(b);
	System.out.println(b.ascend());
    }
}
