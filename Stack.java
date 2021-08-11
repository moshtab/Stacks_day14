package day14_Stack;

interface Istack<T> {
	void push(T data);
	
	T pop();

	boolean isEmpty();

	boolean isFull();
}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}

class Stack<T> implements Istack<T> {
	int maxSize, size;
	Node<T> head;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.head = null;
	}
    @Override
	public void push(T data) {
		if (isFull()) {
			System.out.println("Stack is full");
		}
		if (isEmpty()) {
			head = new Node<T>(data);
		} else {
			Node<T> newNode = new Node<>(data);
			newNode.next = head;
			head = newNode;

		}
		size++;
	}
    public T pop() {
    	if(isEmpty()) {
    		System.out.println("stack is empty");
    	}
    	Node<T>tmp =head;
    	head =head.next;
    	size--;
    	return tmp.data;
    }

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == maxSize;
	}

}
