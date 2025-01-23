package queue;

/**
 * @author YoungCR
 * @date 2025/1/22 14:52
 * @descritpion MyCircularQueue
 */
public class MyCircularQueue {

    private final int[] elements;
    private final int   capacity;
    private       int   head;
    private       int   tail;

    public MyCircularQueue(int k) {
        capacity = k;
        elements = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            elements[tail % capacity] = value;
            return ++tail >= 0;
        }
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            return ++head >= 0;
        }
    }

    public int Front() {
        return isEmpty() ? -1 : elements[head % capacity];
    }

    public int Rear() {
        return isEmpty() ? -1 : elements[(tail - 1) % capacity];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return tail - head == capacity;
    }
}
