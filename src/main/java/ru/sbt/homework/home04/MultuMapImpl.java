package ru.sbt.homework.home04;

import ru.sbt.homework.home01.Truck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 11.09.2016.
 */
public class MultuMapImpl<K, V extends Keyable<K, V>> implements MultiMap<K, V> {
    private Map<K, List<V>> Vs = new HashMap<>();

    @Override
    public void put(K key, V value) {
        List<V> Vs = get(key);
        if (Vs == null) {
            Vs = new ArrayList<>();
            this.Vs.put(key, Vs);
        }
        Vs.add(value);
    }

    @Override
    public List<V> get(K key) {
        return Vs.get(key);
    }

    @Override
    public List<V> getAll() {
        List<V> result = new ArrayList<V>();
        for (List<V> item : Vs.values()) {
            result.addAll(item);
        }
        return result;
    }

    @Override
    public void allAdd(List<V> values) {
        for (V value : values) {
            put(value.getKey(), value.getValue());
        }
    }


}
