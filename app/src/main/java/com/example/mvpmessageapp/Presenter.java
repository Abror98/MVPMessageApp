package com.example.mvpmessageapp;

public class Presenter implements MainMVP.presenter {

    private final MainMVP.view view;

    public Presenter(MainMVP.view view) {
        this.view = view;
    }

    @Override
    public void clickedToastButton() {
       view.displayToastMessage();
    }
}
