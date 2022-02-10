package com.example.counterapp;

public class CounterContracts {
    interface CounterView{
        void updateCounter(int count);
    }
    interface Presenter{
        void increment();
        void attachView(CounterView counterView);
        void decrease();
    }
}
