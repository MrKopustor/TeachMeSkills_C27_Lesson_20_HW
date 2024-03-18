package com.teachmeskills.lesson_20.hw.task_1.launcher;

import com.teachmeskills.lesson_20.hw.task_1.runnable.Breakfast;
import com.teachmeskills.lesson_20.hw.task_1.runnable.HaveCoffee;
import com.teachmeskills.lesson_20.hw.task_1.runnable.ReadingNews;
import com.teachmeskills.lesson_20.hw.task_1.thread.Breakfast_2;
import com.teachmeskills.lesson_20.hw.task_1.thread.HaveCoffee_2;
import com.teachmeskills.lesson_20.hw.task_1.thread.ReadingNews_2;

public class Runner {
    public static void main(String[] args) {
        Thread myt1 = new Thread(new HaveCoffee("Reading the news"));
        Thread myt2 = new Thread(new Breakfast("I'm having breakfast"));
        Thread myt3 = new Thread(new ReadingNews("Drinking delicious coffee"));

        myt1.setPriority(1);
        myt2.setPriority(2);
        myt3.setPriority(3);

        myt1.start();
        myt2.start();
        myt3.start();

        Thread myT4 = new HaveCoffee_2("Reading the news", 1);
        Thread myT5 = new Breakfast_2("I'm having breakfast", 2);
        Thread myT6 = new ReadingNews_2("Drinking delicious coffee", 4);

        myT4.start();
        myT5.start();
        myT6.start();

    }
}
