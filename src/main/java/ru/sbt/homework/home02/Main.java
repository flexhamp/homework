package ru.sbt.homework.home02;

/**
 * Created by user on 11.09.2016.
 */
public class Main {
    public static String str;
    public static void main(String args[]) {
        System.out.println(new Integer(1).equals(new Integer(1)));

        metka:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 7) {
                    System.out.println("break");
                    break metka;
                }
                System.out.println(j);
            }
            System.out.println(i);
        }
        System.out.println("end of method");


    }
}
