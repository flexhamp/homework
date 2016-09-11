package ru.sbt.homework.home01;

import java.util.*;

/**
 * Created by user on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> tt = new ArrayList<>();

//        Truck a1 = new Truck("Kamaz", 545, Type.BENZIN);
//        Truck a11 = new Truck("Kamaz", 515, Type.BENZIN);
//        Truck a12 = new Truck("Kamaz", 525, Type.BENZIN);
//        Truck a13 = new Truck("Kamaz", 535, Type.BENZIN);
//        Truck a2 = new Truck("Kamaz", 321, Type.ELECTRO);
//        Truck a21 = new Truck("Kamaz", 324, Type.ELECTRO);
//        Truck a22 = new Truck("Kamaz", 311, Type.ELECTRO);
//        Truck a23 = new Truck("Kamaz", 322, Type.ELECTRO);
//        Truck a31 = new Truck("Kamaz", 423, Type.DIESEL);
//        Truck a32 = new Truck("Kamaz", 523, Type.DIESEL);
//        Truck a33 = new Truck("Kamaz", 123, Type.DIESEL);

        //System.out.println(a1);

        TruckManager tm = new TruckManagerImpl();
        tm.add(new MegaTruck("Kamaz", 545, Type.BENZIN));
        tm.add(new MegaTruck("Kamaz", 543, Type.BENZIN));
        tm.add(new MegaTruck("Kamaz", 55, Type.BENZIN));
        tm.add(new Truck("Kamaz", 54, Type.BENZIN));
        tm.del(new Truck("Kamaz", 545, Type.BENZIN));

        tm.addAll(Arrays.asList(new Truck("odin", 1, Type.BENZIN),
                new MegaTruck("dva", 2, Type.DIESEL)));

        List<Truck> tru = tm.listtruck();

        Comparator<Truck> compareByNumber = new Comparator<Truck>() {
            @Override
            public int compare(Truck o1, Truck o2) {
                if (o1.number < o2.number) {
                    return -1;
                } else if (o1.number > o2.number) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Comparator<Truck> compareByName = new Comparator<Truck>() {
            @Override
            public int compare(Truck o1, Truck o2) {
                if (o1.name.compareTo(o2.name) < 0) {
                    return -1;
                } else if (o1.name.compareTo(o2.name) > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(tru, compareByNumber);

        for (Truck v:
             tru) {
            System.out.println(v);
        }

        System.out.println("================");
        Collections.sort(tru, compareByName);
        for (Truck v:
                tru) {
            System.out.println(v);
        }


//        printTruck(tm);



    }

    private static void printTruck(TruckManager tm) {
        System.out.println("Truck List");
        int i = 0;
        for(Truck item : tm.listtruck()) {
            System.out.println(i + " " + item);
            i++;
        }
        System.out.println();
    }

}
