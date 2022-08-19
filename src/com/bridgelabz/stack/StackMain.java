package com.bridgelabz.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(70);
        stack1.push(30);
        stack1.push(56);
        stack1.printStack();

        while (!stack1.peak().equals(null)) {
            System.out.println("Data Peak");
            System.out.println(stack1.peak());
            System.out.println("Data Pop");
            System.out.println("Data Popped : " + stack1.pop());
        }
    }
}
