package ru.sbt.homework.home04;

/**
 * Created by user on 11.09.2016.
 */
public interface Keyable<K, V> {
    K getKey();
    V getValue();
}
