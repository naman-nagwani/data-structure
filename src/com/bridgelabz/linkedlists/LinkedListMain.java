package com.bridgelabz.linkedlists;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.add(46);
        list1.show();

        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(56);
        list2.add(30);
        list2.add(70);
        list2.push(46);
        list2.show();

        if (!list2.search(30).equals(null)){
            System.out.println("Data found");
        }
        if(list2.insert(30,40)){
            System.out.println("Insert successful");
            list2.show();
        }

        Integer i = list1.pop();
        if (!i.equals(null))
            System.out.println("Popped data : "+i);
        list1.show();

        Integer j = list2.popLast();
        if (!j.equals(null))
            System.out.println("Popped data : "+j);
        list2.show();
        if (list2.delete(40))
            System.out.println("Delete Successful");
        list2.show();
    }
}
