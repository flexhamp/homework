package ru.sbt.homework.home01;

import ru.sbt.homework.home04.MultiMap;
import ru.sbt.homework.home04.MultuMapImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 11.09.2016.
 */
public class TruckManagerImpl implements TruckManager{
    MultiMap<Type, Truck> trucks = new MultuMapImpl();
    //    List<Truck> trucks = new ArrayList<Truck>();

    public void add(Truck truck) {
        trucks.put(truck.type, truck);
    }

    public void del(Truck truck) {
        getByType(truck.type).remove(truck);
    }

    public List<Truck> listtruck() {
       return trucks.getAll();
    }

    public Truck getByNumber(int number) {
       // return trucks.get(number);
        return null;
    }

    public List<Truck> getByType(Type type){
        return trucks.get(type);
    }

    public void addAll(List<Truck> values) {
        trucks.allAdd(values);
    }
}

