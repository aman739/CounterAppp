package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.Injector;
import com.example.counterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {

    ActivityMainBinding binding;
    CounterPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.attachPresenter();
        presenter.attachView(this);
        initListener();
    }

    private void initListener() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();

            }
        });
        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrease();

            }
        });
    }

    @Override
    public void updateCounter(int count) {
        binding.numberTv.setText(String.valueOf(count));
    }


}
