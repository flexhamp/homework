package ru.sbt.homework.home04;

import java.util.List;

/**
 * Created by user on 11.09.2016.
 */
public interface MultiMap<K, V extends Keyable<K, V>>  {
    void put(K key, V value);

    List<V> get(K key);

    List<V> getAll();

    void allAdd(List<V> values);
}
