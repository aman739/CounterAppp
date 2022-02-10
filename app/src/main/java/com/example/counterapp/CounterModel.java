package com.example.counterapp;

public class CounterModel {
    int count = 0;

    void increment(){
        ++count;
    }
    void decrease(){
        --count;
    }

    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }
}
