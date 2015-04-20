
public class Node {
    private int x,y;
    private Node prev;
    private int priority;
    private int count; 
    
    public Node(int x, int y){
	this.x = x;
	this.y = y;
	count = 0;
	priority = 0;
    }
    public Node (int x, int y, int count){
	this.x = x;
	this.y = y;
	this.count = count;
    }

    
    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
    public int getCount (){
	return count;
    }
    public void setCount(int n){
	count = n;
    }
    public int getPriority() {
	return priority;
    }

    public void setPriority(int a, int b){
        priority = (a-x)*(a-x) + (b-y)*(b-y) ;
    }
    public void setManPriority(int a, int b){
	priority = (a - x) + (b - y);
    }
    

    public void setStar(int a, int b){
	priority = (a-x)*(a-x) + (b-y)*(b-y) + count;
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










