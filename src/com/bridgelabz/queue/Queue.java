package com.bridgelabz.queue;

import com.bridgelabz.linkedlists.LinkedList;

public class Queue<T> {
    public LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T data){
        queue.push(data);
    }

    public T dequeue(){
        if(isEmpty())
            return null;
        else
            return queue.popLast();
    }
    public void printQueue(){
        queue.show();
    }

    public boolean isEmpty(){
        if(queue.head.equals(null))
            return true;
        else
            return false;


    }
}
