package Lesson_4.iterator;

public class LinkIteratorApp {

    public static void main(String[] args) {
        LinkedListIter list = new LinkedListIter();

        LinkIterator itr = new LinkIteratorImpl(list);

        itr.insertAfter("Avksentiy", 112);
        itr.insertBefore("Lukeriya", 814);
        itr.insertAfter("Mstislav", 95);
        itr.insertAfter("Fedosiya", 351);
        itr.reset();

        itr.insertBefore("Svyatopolk", 911);

        itr.nextLink();
        itr.deleteCurrent();


        list.display();
    }
}
