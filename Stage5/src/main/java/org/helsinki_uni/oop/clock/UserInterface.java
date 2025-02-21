package org.helsinki_uni.oop.clock;

import java.time.LocalTime;

public class UserInterface {
    private LocalTime now = LocalTime.now();

    public UserInterface() {}

    ClockHand hours = new ClockHand(24, now.getHour());
    ClockHand minutes = new ClockHand(60, now.getMinute());
    ClockHand seconds = new ClockHand(60, now.getSecond());

    public void start() {
        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);

            seconds.advance();

            if (seconds.value() == 0) {
                minutes.advance();

                if (minutes.value() == 0) {
                    hours.advance();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted.");
                break;
            }
        }
    }
}
