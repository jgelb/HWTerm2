
public class Node {
    private int x,y;
    private Node prev;
    private int priority;	
    public Node(int x, int y){
	this.x = x;
	this.y = y;
	priority = 0;
    }

    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }

    public int getPriority() {
	return priority;
    }

    public void setPriority(int a, int b){
        priority = (a-x)*(a-x) + (b-y)*(b-y) ;
    }

    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public String toString(){
	return ""+priority;
    }
		
}










