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

    public void setProfession (String profession) {
        this.profession = profession;
    }

    public void getPersonInfo () {
        String info = String.format(
                "Ім'я: %s, Вік: %d, Професія: %s",
                this.name, this.age, this.profession
        );

        System.out.println(info);
    }
}
