package Lesson1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arrayTest = {"31","rf","13","j","cat","true"};

        replaceArray(arrayTest, 3, 2);

        arrayToList(arrayTest);

        Box<Apple> boxApple1 = new Box();
        Box<Orange> boxOrange1 = new Box();
        Box<Orange> boxOrange2 = new Box();

        boxOrange1.add(new Orange());
        boxOrange1.add(new Orange());
        boxOrange1.add(new Orange());

        for (int i = 0; i < 5; i++) {
            boxOrange2.add(new Orange());
        }
        for (int i = 0; i < 9; i++) {
            boxApple1.add(new Apple());
        }

        boxOrange1.info();
        boxOrange2.info();
        boxApple1.info();

        System.out.println("Вес коробки: " + boxOrange1.getWeight());
        System.out.println("Вес коробки: " + boxOrange2.getWeight());
        System.out.println("Вес коробки: " + boxApple1.getWeight());

        //Сравнить вес boxOrange1 и boxApple1
        System.out.println(boxOrange1.compare(boxApple1));
        //Сравнить вес boxOrange21 и boxApple1
        System.out.println(boxOrange2.compare(boxApple1));

        boxOrange1.remove(boxOrange2);

        boxOrange1.info();
        boxOrange2.info();
        boxApple1.info();
    }

    static <T> void replaceArray(T[] array, int pos1, int pos2) {
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    private static <E> List<E> arrayToList(E[] array) {
        return Arrays.asList(array);
    }

}
