package ru.sbt.homework.home01;

import java.util.List;

/**
 * Created by user on 11.09.2016.
 */
public interface TruckManager {
    void add(Truck truck);
    void del(Truck truck);
    List<Truck> listtruck();
    Truck getByNumber(int number);
}
