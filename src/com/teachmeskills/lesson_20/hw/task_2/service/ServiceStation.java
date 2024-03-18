package com.teachmeskills.lesson_20.hw.task_2.service;

import static com.teachmeskills.lesson_20.hw.task_2.constant.Const.MAX_CAR;

public class ServiceStation {

    public int car = 0;

    public synchronized void getCar() {
        while (car < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.car--;
        System.out.println("The car left the service station");
        System.out.println("The car is at the service station => " + this.car);

        notify();
    }

    public synchronized void putCar() {
        while (car >= MAX_CAR) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.car++;
        System.out.println("The car has arrived at the station ");
        System.out.println("The car is at the service station => " + this.car);

        notify();
    }
}
