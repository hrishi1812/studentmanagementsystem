package studentmangement;

import java.util.LinkedList;

 class MyQueue<E> {
	LinkedList <E> l=new LinkedList <E>();
	
	public boolean offer(E i){
		l.addFirst(i);
		return true;
	}
	public E peek() {
		return (l.getFirst());
	}
		
	public E poll() {
		return l.removeFirst();
	}
	}

class Demo{
	public static void main(String[] args) {
		MyQueue<Integer> my=new MyQueue<>();
		my.offer(10);
		my.offer(30);
		my.offer(40);
		
		System.out.println(my.l);
		System.out.println(my.peek());
		System.out.println(my.l);
		System.out.println(my.poll());
		System.out.println(my.l);
	}
}


