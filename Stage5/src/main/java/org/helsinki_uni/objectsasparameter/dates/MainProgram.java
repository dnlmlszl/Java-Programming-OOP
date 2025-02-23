package org.helsinki_uni.objectsasparameter.dates;

public class MainProgram {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        System.out.println(muhammad);
        System.out.println(pascal);
    }
}
