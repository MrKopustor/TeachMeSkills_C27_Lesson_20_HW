package com.teachmeskills.lesson_20.hw.task_1.thread;

public class HaveCoffee_2 extends Thread {
    private String nameThread;
    private int priority;

    public HaveCoffee_2(String name, int num) {
        this.nameThread = name;
        this.priority = num;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        Thread.currentThread().setName(nameThread);
        doSomething();
    }

    private void doSomething() {
        System.out.println("Runnable HaveCoffee => " + Thread.currentThread());
    }

}
