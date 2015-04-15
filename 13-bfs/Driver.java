public class Driver{

    public static void main(String args[]){
	Frontier f = new Frontier();
	Node n = new Node(1,1);
	n.setPriority(6,8);
	Node g = new Node(2,2);
	g.setPriority(6,8);

	f.add(g);
	System.out.println(f);
	f.add(n);
	System.out.println(f);
	System.out.println(f.remove());
    }
}
