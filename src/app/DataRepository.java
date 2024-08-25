package app;

public class DataRepository {

    public Person[] getPersonsData () {
        return new Person[] {
             new Person("bob", 30, "devOps"),
             new Person("alice", 33, "react dev"),
             new Person("kiri", 28, "qa")
        };
    }
}
