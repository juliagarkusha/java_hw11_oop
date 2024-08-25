package app;

import java.lang.reflect.Array;

public class DataHandler {
    public Person getPersonByIndex (Person[] persons, int index) {
        return (Person) Array.get(persons, index);
    }
}
