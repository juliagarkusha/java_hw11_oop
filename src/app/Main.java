package app;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person("bob", 30, "devOps");
        Person alice = new Person("alice", 33, "react dev");
        Person kiri = new Person("kiri", 28, "qa");

        bob.getPersonInfo();
        alice.getPersonInfo();
        kiri.getPersonInfo();

        bob.setProfession("java dev");
        bob.getPersonInfo();
    }
}
