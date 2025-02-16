package org.helsinki_uni.hashmaps.nicknames;

import java.util.HashMap;

public class NickMain {

    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();

        users.put("Matthew", "Matt");
        users.put("Michael", "Mix");
        users.put("Arthur", "Artie");

        System.out.println("Matthew's nickname is " + users.get("Matthew"));
        System.out.println("Michael's nickname is " + users.get("Michael"));
        System.out.println("Arthur's nickname is " + users.get("Arthur"));
    }
}
