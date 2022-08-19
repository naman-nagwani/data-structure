package com.bridgelabz.linkedlists;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void show(){
        if(head == null){
            System.out.println("Linked list is Empty");
        }
        else{
            Node<T> temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public Node<T> search(T searchData) {

        Node<T> temp = head;
        while(temp != null){
            if (temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insert(T searchData, T insertData) {
        Node<T> temp = search(searchData);
        if (temp.equals(null))
            return false;
        else {
            Node<T> newNode = new Node<>(insertData);
            newNode.next = temp.next;
            temp.next = newNode;
            return true;
        }
    }

    public T pop() {
        if (head.equals(null))
            return null;
        else {
            Node<T> temp = head;
            head = head.next;
            return temp.data;
        }
    }

    public T popLast() {
        if (head.equals(null))
            return null;
        else {
            T res;
            if(head.equals(tail)) {
                res= head.data;
                head=null;
                tail=null;
                return res;
            }
            Node<T> temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            res = tail.data;
            tail = temp;
            tail.next = null;
            return res;
        }
    }

    public boolean delete(T deleteData) {
        Node<T> temp = head;
        Node<T> deleteNode = search(deleteData);
        if (deleteNode.equals(null))
            return false;
        else {
            if (deleteNode.equals(head)){
                head = head.next;
            }
            else {
                while (temp != null) {
                    if (temp.next.equals(deleteNode)) {
                        temp.next = deleteNode.next;
                        break;
                    }
                    temp = temp.next;
                }
            }
            return true;
        }

    }
}

