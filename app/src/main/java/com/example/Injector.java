package com.example;

import com.example.counterapp.CounterPresenter;

public class Injector {

    public static CounterPresenter attachPresenter() {
        return new CounterPresenter();
    }

}
