package app;

public class Main {
    static String title;

    public static void main(String[] args) {

        Person[] persons = new DataRepository().getPersonsData();
        DataView view = new DataView();
        DataHandler handler = new DataHandler();

        title = "Initial data: ";
        view.printPersonList(title, persons);

        title = "Person: ";
        Person person = handler.getPersonByIndex(persons, 1);
        view.printPerson(title, person);

        title = "Updated person: ";
        Person personUpd = person.setProfession("java dev");
        view.printPerson(title, personUpd);

        title = "Updated data: ";
        view.printPersonList(title, persons);
    }
}
