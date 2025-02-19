package org.helsinki_uni.oop.objects;

public class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(sound);
    }
}
