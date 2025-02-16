package org.helsinki_uni.recap.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        if (task == null || task.trim().isEmpty()) {
            System.out.println("Cannot add an empty task.");
            return;
        }
        todoList.add(task.trim());
    }

    public void remove(int number) {
        if (number <= 0 || number > todoList.size()) {
            System.out.println("Cannot remove a non existing task. Please provide a number between 1 and " + todoList.size());
            return;
        }
        String removedTask = todoList.remove(number - 1);
        System.out.println("Task removed: " + removedTask);
    }

    public void print() {
        if (todoList.isEmpty()) {
            System.out.println("There are no tasks for today");
            return;
        }
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ": " + todoList.get(i));
        }
    }

}
