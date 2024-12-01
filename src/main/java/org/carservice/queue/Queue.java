package org.carservice.queue;

public interface Queue<T> {
    void enqueue(T item); // Add an item to the queue
    T dequeue(); // Remove and return the item from the front of the queue
    boolean isEmpty(); // Check if the queue is empty
    int size(); // Get the number of items in the queue
}
