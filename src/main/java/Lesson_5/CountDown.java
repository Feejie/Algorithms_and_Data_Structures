package Lesson_5;

public class CountDown {

    public static void main(String[] args) {

        countDownLoop(5);
        countDownRecursion(5);
    }

    private static void countDownLoop(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }

    private static void countDownRecursion(int n) {
        if (n > 0) {
            System.out.println(n);
            countDownRecursion(--n);
        }
    }


}
