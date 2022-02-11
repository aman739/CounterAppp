package com.example.counterapp;

public class CounterContracts {
    interface CounterView {
        void updateCounter(int count);
        void green();
    }

    interface Presenter {
        void increment();

        void attachView(CounterView counterView);

        void decrease();


        void green();

    }
}
