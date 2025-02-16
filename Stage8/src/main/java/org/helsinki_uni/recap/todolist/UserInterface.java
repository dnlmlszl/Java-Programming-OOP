package org.helsinki_uni.recap.todolist;

import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private final Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    public void start() {
        System.out.println("==# Your daily todos #==");
        while (true) {
            System.out.println("Enter command (add, remove, list, stop):");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                System.out.println("Goodbye user!");
                break;
            }

            switch (command.trim()) {
                case "add" -> {
                    System.out.println("Enter your task: ");
                    String todo = scanner.nextLine();
                    todoList.add(todo);
                }
                case "list" -> {
                    System.out.println("Your tasks for today:");
                    todoList.print();
                }
                case "remove" -> {
                    System.out.println("Select you todo to remove:");
                    try {
                        int index = Integer.parseInt(scanner.nextLine().trim());
                        todoList.remove(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }

                }
                default -> System.out.println("Unknown command. Available commands: add, move, remove, stop.");
            }
        }
    }
}
