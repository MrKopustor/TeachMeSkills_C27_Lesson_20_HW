package com.teachmeskills.lesson_20.hw.task_2.executor;

import com.teachmeskills.lesson_20.hw.task_2.service.ServiceStation;

public class Executor extends Thread {

    private ServiceStation serviceStation;

    public Executor(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        doRepairCar();
    }

    public void doRepairCar() {
        int i = 0;
        for (; i < 5; i++) {
            serviceStation.getCar();
        }
        System.out.println("Service car: " + i);
    }
}
