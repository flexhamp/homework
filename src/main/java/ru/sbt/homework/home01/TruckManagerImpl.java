package ru.sbt.homework.home01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 11.09.2016.
 */
public class TruckManagerImpl implements TruckManager{
    Map<Type, List<Truck>> trucks = new HashMap<>();
    //    List<Truck> trucks = new ArrayList<Truck>();

    public void add(Truck truck) {
        List<Truck> trucks = getByType(truck.type);
        if(trucks == null){
            trucks = new ArrayList<>();
            this.trucks.put(truck.type, trucks);
        }
        trucks.add(truck);
    }

    public void del(Truck truck) {
        getByType(truck.type).remove(truck);
    }

    public List<Truck> listtruck() {
        List<Truck> result = new ArrayList<Truck>();
        for (List<Truck> item : trucks.values()){
            result.addAll(item);
        }
        return result;
    }

    public Truck getByNumber(int number) {
       // return trucks.get(number);
        return null;
    }

    public List<Truck> getByType(Type type){
        return trucks.get(type);
    }
}

