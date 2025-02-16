package org.helsinki_uni.sounds;

public class SongMain {
    public static void main(String[] args) {
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.getName() + " has a length of " + garden.getLength() + " seconds.");
    }
}
