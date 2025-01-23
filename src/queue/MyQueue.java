package queue;

import java.util.Stack;

/**
 * @author YoungCR
 * @date 2025/1/22 10:48
 * @descritpion MyQueue
 */
public class MyQueue {

    private Stack<Integer> master;
    private Stack<Integer> slave;

    public MyQueue() {
        master = new Stack<>();
        slave = new Stack<>();
    }

    public void push(int x) {
        master.push(x);
    }

    public int pop() {
        if (!slave.isEmpty()) {
            return slave.pop();
        } else {
            while (!master.isEmpty()) {
                slave.push(master.pop());
            }
            return slave.pop();
        }
    }

    public int peek() {
        if (!slave.isEmpty()) {
            return slave.peek();
        } else {
            while (!master.isEmpty()) {
                slave.push(master.pop());
            }
            return slave.peek();
        }
    }

    public boolean empty() {
        return master.isEmpty() && slave.isEmpty();
    }
}
