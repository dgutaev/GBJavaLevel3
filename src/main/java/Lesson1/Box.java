package Lesson1;

import java.util.ArrayList;
import java.util.List;


public class Box<T extends Fruits> {

    public List<T> getList() {
        return fruitCount;
    }

    private List<T> fruitCount;

    public Box() {
        fruitCount = new ArrayList<T>();
    }

    void add(T obj) {
        fruitCount.add(obj);
    }

    void remove(Box<T> box) {
        box.getList().addAll(fruitCount);
        fruitCount.clear();
    }

    void info() {
        if (fruitCount.isEmpty()) System.out.println("Коробка пуста");
        else System.out.println("В коробке " + fruitCount.get(0).toString() + " = " + fruitCount.size() + " штук.");
    }

    float getWeight() {
        if (fruitCount.isEmpty()) return 0;
        else return (fruitCount.size() * fruitCount.get(0).getWeight());
    }

    boolean compare(Box<? extends Fruits> box) {
        return this.getWeight() == box.getWeight();
    }
}

