import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<String>();

        // Adding elements to the queue
        myQueue.add("apple");
        myQueue.add("banana");
        myQueue.add("orange");

        // Printing the queue
        System.out.println("Queue: " + myQueue);

        // Accessing the front element of the queue
        String frontElement = myQueue.peek();
        System.out.println("Front element: " + frontElement);

        // Removing an element from the queue
        String removedElement = myQueue.remove();
        System.out.println("Removed element: " + removedElement);

        // Printing the queue again
        System.out.println("Queue after removing front element: " + myQueue);
    }
}
/*This code creates a LinkedList object and adds some elements to it using the add method.
It then prints the queue using System.out.println, accesses the front element of the queue using peek, removes an element
from the queue using remove, and prints the queue again. Since LinkedList implements the Queue interface,
we can use all of the methods of the Queue interface with a LinkedList object.
 The add method is used to add elements to the back of the queue,
 the peek method is used to access the front element without removing it,
 and the remove method is used to remove the front element from the queue and return it.*/

