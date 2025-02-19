package org.helsinki_uni.oop.people;

public class PeopleMain {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");

        pekka.setHeight(180);
        pekka.setWeight(86);

        antti.setHeight(175);
        antti.setWeight(64);

        int i = 0;
        while (i < 30) {
            pekka.growOlder();
            i = i + 1;
        }

        antti.growOlder();

        System.out.println();

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

        System.out.println();

        System.out.println(antti);
        System.out.println(pekka);

        System.out.printf("%s, body mass index is %.2f\n", pekka.getName(), pekka.bodyMassIndex());
        System.out.printf("%s, body mass index is %.2f\n", antti.getName(), antti.bodyMassIndex());
    }
}
