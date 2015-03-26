public class myQueue<E> {
    public Node<E> start;
    public Node<E> end;

    public myQueue(){
	//start = null;
	//end = null;
	end.setNext(start);
    }
    public boolean empty(){
	return (end.getNext() == start);
    }
    public void enQueue(E e){
	Node<E>  tmp = new Node<E>(e);
	tmp.setNext(end.getNext() );
	end.setNext(tmp);

    }
    public E deQueue (){
	E retval = start.getNext().getData();
	start.setNext(start.getNext().getNext() );
	return retval;
    }
    public E head(){
	E retval = start.getNext().getData();
       	return retval;
    }

}
    
