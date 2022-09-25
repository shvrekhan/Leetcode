class MyCircularQueue {
public:
    MyCircularQueue(int k) {
        data.resize(k);
        head = 0;
        tail = 0;
        reset = true;
    }
    
    bool enQueue(int value) {
        if (isFull()) return false;
        // update the reset value when first enqueue happens
        if (head == tail && reset) reset = false;
        data[tail] = value;
        tail = (tail + 1) % data.size();
        return true;
    }
    
    bool deQueue() {
        if (isEmpty()) return false;
        head = (head + 1) % data.size();
        if (head == tail && !reset) reset = true; 
        return true;
    }
    
    int Front() {
        if (isEmpty()) return -1;
        return data[head];
    }
    
    int Rear() {
        if (isEmpty()) return -1;
        return data[(tail + data.size() - 1) % data.size()];
    }
    
    bool isEmpty() {
        if (tail == head && reset) return true;
        return false;
    }
    
    bool isFull() {
        if (tail == head && !reset) return true;
        return false;
    }
private:
    vector<int> data;
    int head;
    int tail;
    bool reset;
};