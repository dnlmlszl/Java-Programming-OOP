package org.helsinki_uni.oop.objects;

public class WhistleMain {
    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kwaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
