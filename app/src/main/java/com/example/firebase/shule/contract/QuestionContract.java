package com.example.firebase.shule.contract;

public interface QuestionContract {
    interface View{
        void shouldSetQuestion();
        boolean shouldCheckIfAnswerSelectedIsCorrect();
        void shouldListenToFb();
        void shouldInitializeFields();
        int shouldCountItems();
    }

    interface Presenter{
        void setQuestion();
        boolean isAnswerCorrect();
        void listenToFb();
        void initializeFields();
        int countItems();
    }
}
