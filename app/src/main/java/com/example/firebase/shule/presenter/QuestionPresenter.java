package com.example.firebase.shule.presenter;

import android.view.View;

import com.example.firebase.shule.contract.QuestionContract;
import com.example.firebase.shule.model.Question;

/**
 * This is the {@link com.example.firebase.shule.contract.TopicContract.Presenter}
 * for the {@link com.example.firebase.shule.activity.TopicActivity}
 */
public class QuestionPresenter implements QuestionContract.Presenter {
    QuestionContract.View view;
    Question question;

    public QuestionPresenter(QuestionContract.View view) {
        this.view = view;
        question = new Question("data question", "01","01","02","03","04","testTopic");
    }

    @Override
    public void setQuestion(Question mQuestion) {
        if (mQuestion != null) {
            view.shouldSetQuestion(mQuestion);
        } else {
            view.shouldSetQuestion(this.question);
        }
    }

    @Override
    public void isAnswerCorrect(View v, String answer, String hint) {
        view.shouldCheckIfAnswerSelectedIsCorrect(v, answer,hint);
    }

    @Override
    public void listenToFb() {
        view.shouldListenToFb();
    }

    @Override
    public void initializeFields() {
        view.shouldInitializeFields();
    }

    @Override
    public int countItems() {
        return view.shouldCountItems();
    }

    @Override
    public void openRef() {
        view.shouldOpenRef();
    }
}
