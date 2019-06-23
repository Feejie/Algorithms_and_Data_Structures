package Lesson_4.dz2;

public class LinkIteratorImpl implements LinkIterator {

    private Link current;
    private Link previous;
    private LinkedListIter list;

    public LinkIteratorImpl(LinkedListIter list) {
        this.list = list;
        this.reset();
    }

    @Override
    public void reset() {
        current = list.getFirst();
        previous = null;
    }

    @Override
    public boolean atEnd() {
        return current.next == null;
    }

    @Override
    public void nextLink() {
        previous = current;
        current = current.next;
    }

    @Override
    public Link getCurrent() {
        return current;
    }

    @Override
    public void insertAfter(String name, int age) {
        Link newLink = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(newLink);
            current = newLink;
        }
        else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    @Override
    public void insertBefore(String name, int age) {
        Link newLink = new Link(name, age);
        if (previous == null) {
            newLink.next = list.getFirst();
            list.setFirst(newLink);
            reset();
        }
        else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    @Override
    public String deleteCurrent() {
        String name = current.name;

        if (previous == null) {
            list.setFirst(current.next);
            reset();
        }
        else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            }
            else {
                current = current.next;
            }
        }

        return name;
    }
}
