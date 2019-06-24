package Lesson_4.dz2;

public interface LinkIterator {

    static class Link {
        protected String name;
        protected int age;

        protected Link next;

        public Link(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + this.name + ", age: " + this.age);
        }
    }

    void reset();

    boolean atEnd();

    void nextLink();

    Link getCurrent();

    void insertBefore(String name, int age);

    void insertAfter(String name, int age);

    String deleteCurrent();
}
