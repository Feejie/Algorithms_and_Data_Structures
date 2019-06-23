package Lesson_4.dz2;

public class LinkedListIter {

    private LinkIterator.Link first;

    public LinkedListIter() {
        first = null;
    }

    public LinkIterator.Link getFirst() {
        return first;
    }

    public void setFirst(LinkIterator.Link first) {
        this.first = first;
    }

    public LinkIteratorImpl getIterator() {
        return new LinkIteratorImpl(this);
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void display() {
        LinkIterator.Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}
