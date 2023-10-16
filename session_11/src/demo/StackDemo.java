package demo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("mảng ban stack ban đầu:"  + stack);
        System.out.println("pop giá trị ra khỏi stack: "+ stack.pop());
        System.out.println("giá trị ở đỉnh stack: "+stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty()?"stack rỗng":"stack có phần tử");
        System.out.println("mảng ban stack sau:"  + stack);

    }
}
