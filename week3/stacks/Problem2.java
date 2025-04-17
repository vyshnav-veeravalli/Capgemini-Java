package week3.stacks;

import java.util.Stack;

public class Problem2 {

    public static void sorting(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int top = stack.pop();
            sorting(stack);
            insert(stack, top);

        }
    }

    public static void insert(Stack<Integer> stack, int element){
        if(stack.isEmpty() || stack.peek() <= element){
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insert(stack, element);
        stack.push(top);
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(8);
        stack.push(49);

        System.out.println("original stack: "+stack);
        sorting(stack);
        System.out.println("final stack: "+stack);

    }
}
