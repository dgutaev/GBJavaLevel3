package Lesson1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arrayTest = {"31","rf","13","j","cat","true"};

        replaceArray(arrayTest, 3, 2);

        List<String> strings = arrayToList(arrayTest);
        System.out.println();

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
