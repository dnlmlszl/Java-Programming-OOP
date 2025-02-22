package org.helsinki_uni.oop.fitbyte;

public class FitbyteMain {
    public static void main(String[] args) {
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1) {
            double target = assistant.targetHeartRate(percentage);
            System.out.printf("Target HR %.0f%% of maximum: %.2f\n", (percentage * 100), target);
            percentage += 0.1;
        }
    }
}
