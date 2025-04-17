package week3.stacks;


import java.util.Stack;
class MyQuee{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x){
        s1.push(x);
        System.out.println("sent into the queue: "+x);
    }

    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("queue is empty");
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("queue is empty");
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}


public class Problem1{
    public static void main(String[] args){
        MyQuee q = new MyQuee();
        q.enqueue(2);
        q.enqueue(84);
        q.enqueue(542);
        System.out.println("Dequeued: " + q.dequeue());
        q.enqueue(7);
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

    }
}