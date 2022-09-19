import java.util.EmptyStackException;

import java.util.EmptyStackException;

public class ArrayStack {

    private String[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new String[capacity];
    }

    public void push(String string) {
        if (top == stack.length) {
            String[] newArray = new String[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = string;
    }
    public String pop(){
        if (isEmpty()){
            throw new EmptyStackException();}
        String string = stack [--top];
        stack[top] = null;
        return string;

    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top ==0;
    }
    public void printStack(){
        for (int i =top -1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}