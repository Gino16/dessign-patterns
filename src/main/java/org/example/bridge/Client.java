package org.example.bridge;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<Integer>());
		collection.offer(1);
		collection.offer(5);
		collection.offer(3);

		System.out.println("Polling: " + collection.poll());
		System.out.println("Polling: " + collection.poll());
		System.out.println("Polling: " + collection.poll());
	}

}
