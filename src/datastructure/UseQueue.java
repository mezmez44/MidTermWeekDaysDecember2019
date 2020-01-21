package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		//create an iceCream line Queue
		Queue<String> iceCreamLine = new LinkedList<>();
		//add data into the queue
		iceCreamLine.add("David");
		iceCreamLine.add("sara");
		iceCreamLine.add("Rockey");
		iceCreamLine.add("Erick");
		iceCreamLine.add("Lynda");

		//Peek Data From the queue

		System.out.println("peek: " + " " + iceCreamLine.peek());// David will be the First

		//remove data from the queue
		System.out.println("Remove:" + " " + iceCreamLine.remove());
		// pool
		System.out.println("pool:" + " " + iceCreamLine.poll());

		// Using for each loop
		System.out.println("using for each loop");
		for (String s : iceCreamLine) {
			System.out.print(s + " ");
		}
		//using Iterator
		System.out.println("\n"+"using Iterator:");
		Iterator iterator = iceCreamLine.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
}