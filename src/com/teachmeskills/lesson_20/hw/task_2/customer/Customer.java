package com.teachmeskills.lesson_20.hw.task_2.customer;

import com.teachmeskills.lesson_20.hw.task_2.service.ServiceStation;

public class Customer extends Thread {

    private ServiceStation serviceStation;

    public Customer(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        bringCar();
    }

    public void bringCar() {
        int i = 0;
        for (; i < 5; i++) {
            serviceStation.putCar();
        }
        System.out.println("Bring car: " + (i));
    }
}
