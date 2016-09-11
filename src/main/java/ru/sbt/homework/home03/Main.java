package ru.sbt.homework.home03;

import java.util.*;

/**
 * Created by user on 11.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            apples.add(new Apple(new Random().nextInt()));
        }

        Collections.sort(apples);
        for (Apple item : apples) {
            System.out.println(item.id);
        }

        Iterator<Apple> iter = apples.iterator();
        while (iter.hasNext()) {
            Apple appleCurent = iter.next();
            if (appleCurent.id % 2 != 0) {
                iter.remove();
            }
        }




//
//        for (Apple item : apples) {
//            if (item.id % 2 != 0) {
//                apples.remove(item);
//            }
//        }


        System.out.println("");
        for (Apple item : apples) {
            System.out.println(item.id);
        }

        System.out.println(apples.get(1).compareTo(new Apple(1)));
    }
}
