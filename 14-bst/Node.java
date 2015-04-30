public class Node{
    private int data;
    private Node left,right;
    public Node(){
	left = null;
	right = null;
    }
    public Node(int data){
	this();
	this.data=data;
    }
    public Node getLeft(){
	return left;
    }
    public Node getRight(){
	return right;
    }
    public int getData(){
	return data;
    }
    public void setLeft(Node n){
	left = n;
    }
    public void setRight(Node n){
	right = n;
    }
    public void setData(int n){
	data = n;
    }
    public int numKids(){
	int n = 0;
	if(left!=null){
	    n++;
	}
	if(right!=null){
	    n++;
	}
	return n;
    }
    public String toString(){
	return data + ",";
    }
}
