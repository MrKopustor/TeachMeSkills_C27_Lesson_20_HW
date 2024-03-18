package com.teachmeskills.lesson_20.hw.task_1.runnable;

public class HaveCoffee implements Runnable {
    private String name;

    public HaveCoffee(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        doSomething();
    }

    private void doSomething() {
        System.out.println("Runnable HaveCoffee => " + Thread.currentThread());
    }
}
