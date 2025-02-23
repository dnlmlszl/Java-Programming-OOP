package org.helsinki_uni.objectsasparameter.cardpayments;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int healthyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double affordableMealPrice = 2.50;
        if (payment >= affordableMealPrice) {
            this.money += affordableMealPrice;
            this.affordableMeals++;

            return payment - affordableMealPrice;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMealPrice = 2.50;
        if (card.balance() >= affordableMealPrice) {
            card.takeMoney(affordableMealPrice);
            return true;
        } else return false;
    }
    public double eatHeartily(double payment) {
        double heartilyMealPrice = 4.30;
        if (payment >= heartilyMealPrice) {
            this.money += heartilyMealPrice;
            this.healthyMeals++;
            return payment - heartilyMealPrice;
        } else {
            return payment;
        }
    }
    public boolean eatHeartily(PaymentCard card) {
        double heartilyMealPrice = 4.30;
        if (card.balance() >= heartilyMealPrice) {
            card.takeMoney(heartilyMealPrice);
            return true;
        } else return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    @Override
    public String toString() {
        return String.format("Money:\t\t\t\t\t\t\t\t%4.2f\nNumber of sold affordable meals:\t%2d\nNumber of hearty meals:\t\t\t\t%2d\n", this.money, this.affordableMeals, this.healthyMeals);
    }
}
