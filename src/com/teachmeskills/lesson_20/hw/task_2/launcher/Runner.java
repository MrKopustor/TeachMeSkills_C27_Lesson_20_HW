package com.teachmeskills.lesson_20.hw.task_2.launcher;

import com.teachmeskills.lesson_20.hw.task_2.customer.Customer;
import com.teachmeskills.lesson_20.hw.task_2.service.ServiceStation;
import com.teachmeskills.lesson_20.hw.task_2.executor.Executor;

public class Runner {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();

        Executor worker = new Executor(station);
        Customer client = new Customer(station);

        client.start();
        worker.start();
    }
}

