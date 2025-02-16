package org.helsinki_uni.hashmaps.iou;

import java.util.HashMap;

public class IOU {
    private HashMap<Person, Double> debts;

    public IOU() {
        this.debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        Person person = new Person(toWhom);
        debts.put(person, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        Person person = new Person(toWhom);
        return debts.getOrDefault(person, 0.0);
    }
}
