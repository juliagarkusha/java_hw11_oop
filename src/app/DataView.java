package app;

public class DataView {

    public void printPerson (String title, Person person) {
        System.out.println(title + ": " + person + "\n");
    }

    public void printPersonList (String title, Person[] persons) {
        System.out.println(title);

        int count = 0;

        for (Person person: persons) {
            count++;
            System.out.println(count + ") " + person.toString());
        }

        System.out.println();
    }
}
