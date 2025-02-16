package org.helsinki_uni.recap.todolist;

import java.util.Scanner;

public class TodoMain {
    private static final TodoList todoList = new TodoList();
    private static final Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(todoList, scanner);

        ui.start();

    }
}
