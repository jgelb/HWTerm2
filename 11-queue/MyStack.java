import java.util.*;
import java.io.*;

//stack will contain nodes from a linked list

public class MyStack<E> {
    private Node<E> dummy;
    public MyStack(){
	dummy = new Node<E>();
    }
    public boolean empty(){
	return dummy.getNext() == null;
    }
    public void push(E data){
	Node<E> tmp = new Node<E>(data);
	tmp.setNext(dummy.getNext() );
	dummy.setNext(tmp);
    }
    public E pop(){
	if (empty () ) {
	    throw new EmptyStackException();
	}
	else{
	    E retval = dummy.getNext().getData();
	    dummy.setNext(dummy.getNext().getNext() );
	    return retval;
	}
	
    }
    public E top(){
	if (empty () ) {
	    throw new EmptyStackException();
	}
	else{
	    return dummy.getNext().getData();
	}
	
    }

    public String toString() {
	String s = "";
	Node<E> tmp = dummy.getNext();
	while (tmp != null) {
	    s += tmp.getData() + "\n";
	    tmp = tmp.getNext();
	}
	return s;
    }
  
}
