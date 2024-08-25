package app;

import java.lang.reflect.Array;

public class Main {
    static String title;

    public static void main(String[] args) {

        Person[] persons = new DataRepository().getPersonsData();

        title = "Initial data: ";
        printPersonList(title, persons);

        title = "Person: ";
        Person person = getPersonByIndex(persons, 1);
        printPerson(title, person);

        title = "Updated person: ";
        Person personUpd = person.setProfession("java dev");
        printPerson(title, personUpd);

        title = "Updated data: ";
        printPersonList(title, persons);
    }

    private static void printPerson (String title, Person person) {
        System.out.println(title + ": " + person + "\n");
    }

    private static Person getPersonByIndex (Person[] persons, int index) {
        return (Person) Array.get(persons, index);
    }

    private static void printPersonList (String title, Person[] persons) {
        System.out.println(title);

        int count = 0;

        for (Person person: persons) {
            count++;
            System.out.println(count + ") " + person.toString());
        }

        System.out.println();
    }
}
