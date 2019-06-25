package Lesson_5.homework5;

public class Hw5Task1 {

    public static void main(String[] args) {

        System.out.println(numberToDegree(-5, 6));


    }

    private static int numberToDegree(int num, int degree) {
        if (degree < 0) {
            throw new ExceptionInInitializerError("Negative degree");
        }

        if (degree == 0) {
            return 1;
        }

        return num * numberToDegree(num, degree - 1);
    }
}
