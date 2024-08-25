package app;

public class Person {
    String name;
    int age;
    String profession;

    public Person (String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public Person setProfession (String profession) {
        this.profession = profession;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Ім'я: %s, Вік: %d, Професія: %s", name, age, profession);
    }
}
