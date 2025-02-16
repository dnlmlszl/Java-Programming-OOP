package org.helsinki_uni.people;

public class PeopleMain {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");

        int i = 0;
        while (i < 30) {
            pekka.growOlder();
            i = i + 1;
        }

        antti.growOlder();

        System.out.println("");

        if (antti.isOfLegalAge()) {
            System.out.print("Of legal age: ");
            antti.printPerson();
        } else {
            System.out.print("Underage: ");
            antti.printPerson();
        }

        if (pekka.isOfLegalAge()) {
            System.out.print("Of legal age: ");
            pekka.printPerson();
        } else {
            System.out.print("Underage: ");
            pekka.printPerson();
        }
    }
}
