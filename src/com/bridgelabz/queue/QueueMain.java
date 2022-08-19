package com.bridgelabz.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new Queue<>();
        queue1.enqueue(70);
        queue1.enqueue(30);
        queue1.enqueue(56);
        queue1.printQueue();

        System.out.println("Data Pop");
        System.out.println("Data Popped : " + queue1.dequeue());
    }
}
