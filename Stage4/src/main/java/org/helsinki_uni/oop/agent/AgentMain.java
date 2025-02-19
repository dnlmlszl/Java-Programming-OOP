package org.helsinki_uni.oop.agent;

public class AgentMain {
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        Agent ionic = new Agent("Ionic", "Bond");

        System.out.println(bond);
        System.out.println(ionic);
    }
}
