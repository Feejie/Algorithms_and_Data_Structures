package Lesson_3.queue;

public class DequeueImpl<E> extends QueueImpl<E> implements Dequeue<E>{

    @SuppressWarnings("unchecked")
    public DequeueImpl(int maxSize) {
        super(maxSize);
        this.data = (E[]) new Object[maxSize];
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        if (head == DEFAULT_HEAD) {
            head = data.length;
        }

        data[--head] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        return super.insert(value);
    }

    @Override
    public E removeLeft() {
        return super.remove();
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }

        if (tail == 0) {
            tail = lastIndex();
        }

        size--;
        return data[tail--];
    }

}
