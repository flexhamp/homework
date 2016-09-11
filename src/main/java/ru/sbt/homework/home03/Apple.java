package ru.sbt.homework.home03;

/**
 * Created by user on 11.09.2016.
 */
public class Apple implements Comparable<Apple> {
    public int id;

    public Apple(int i) {
        id = i;
    }

    @Override
    public int compareTo(Apple o) {
        if(id < o.id) {
            return -1;
        } else if (id > o.id) {
            return 1;
        } else {
            return 0;
        }
    }
}
