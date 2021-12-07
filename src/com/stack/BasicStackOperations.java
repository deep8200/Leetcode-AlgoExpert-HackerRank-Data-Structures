package com.stack;

import java.util.Stack;

public class BasicStackOperations
{
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
         myStack.push(12);
         myStack.push(23);
         myStack.push(34);
         myStack.push(45);
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.size());

         myStack.push(88);
         myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
         myStack.push(66);
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.size());

    }
}
