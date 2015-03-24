import java.lang.Integer;

public class Driver {
	public static void main(String[] args) {
		MyStack<Integer> s = new MyStack<Integer>();
		System.out.println(s.empty());
		for (int i = 0 ; i < 10 ; i++) {
			s.push(i);
		}
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s);
	}
}
