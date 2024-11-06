public class designCircularQueue {
    private int[] deque;
    private int capacity, rear, front, size;

    public designCircularQueue(int k) {
        this.capacity = k;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.deque = new int[capacity];
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;  // Move front pointer
        deque[front] = value;
        size++;
        if (size == 1) {
            rear = front;  // Set both front and rear to same when it's the first element
        }
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;  // Move rear pointer
        deque[rear] = value;
        size++;
        if (size == 1) {
            rear = front;  // Set both front and rear to same when it's the first element
        }
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;  // Move front pointer
        size--;
        if (size == 0) {
            rear = -1;  // Reset rear when deque becomes empty
            front = 0;  // Reset front when deque becomes empty
        }
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;  // Move rear pointer
        size--;
        if (size == 0) {
            front = 0;  // Reset front when deque becomes empty
            rear = -1;  // Reset rear when deque becomes empty
        }
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return deque[rear];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == capacity);
    }
}
