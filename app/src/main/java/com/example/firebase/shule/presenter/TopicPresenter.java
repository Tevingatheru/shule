package com.example.firebase.shule.presenter;

import com.example.firebase.shule.contract.TopicContract;

public class TopicPresenter implements TopicContract.Presenter {
    TopicContract.View view;

    public TopicPresenter(TopicContract.View view) {
        this.view = view;
    }
}