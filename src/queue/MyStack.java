package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author YoungCR
 * @date 2025/1/22 11:08
 * @descritpion MyStack
 */
public class MyStack {

    private Queue<Integer> master;
    private Queue<Integer> slave;

    public MyStack() {
        master = new LinkedList<>();
        slave = new LinkedList<>();
    }

    public void push(int x) {
        slave.offer(x);
        while (!master.isEmpty()) {
            slave.offer(master.poll());
        }
        Queue<Integer> temp = master;
        master = slave;
        slave= temp;
    }

    public int pop() {
        return master.poll();
    }

    public int top() {
        return master.peek();
    }

    public boolean empty() {
        return master.isEmpty();
    }
}
