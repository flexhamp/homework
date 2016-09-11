package ru.sbt.homework.home01;

import ru.sbt.homework.home04.Keyable;

/**
 * Created by user on 11.09.2016.
 */
public class Truck implements Keyable<Type, Truck> {
    String name;
    int number;
    public Type type;

    @Override
    public String toString() {
        return name + " " + number + " " + type;
    }

    //Создадим конструктор
    Truck(String name, int number, Type type){
        this.name = name;
        this.number = number;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truck truck = (Truck) o;

        if (number != truck.number) return false;
        if (!name.equals(truck.name)) return false;
        return type == truck.type;

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + number;
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public Type getKey() {
        return type;
    }

    @Override
    public Truck getValue() {
        return this;
    }
}
