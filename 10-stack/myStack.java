//stack will contain nodes from a linked list

public class myStack<E> {
    private Node<E> dummy;
    public myStack<E>(){
	dummy = new Node<E>();
    }
    
    public boolean empty(){
	return dummy.getNext() == null;
    }
    public void push
