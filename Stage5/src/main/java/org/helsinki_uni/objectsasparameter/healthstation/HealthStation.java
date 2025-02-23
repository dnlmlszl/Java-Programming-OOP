package org.helsinki_uni.objectsasparameter.healthstation;

public class HealthStation {
    private int measuring;

    public HealthStation() {
        this.measuring = 0;
    }

    public int weigh(Person person) {
        this.measuring++;

        return person.getWeight();
    }

    public void feed(Person person) {
        int newWeight = person.getWeight() + 1;

        if (newWeight >= 0) {
            person.setWeight(newWeight);
        }
    }

    public int weightings() {
        return measuring;
    }
}
