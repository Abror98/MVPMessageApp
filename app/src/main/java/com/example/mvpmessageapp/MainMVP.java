package com.example.mvpmessageapp;

public class MainMVP {

    interface view{
        void displayToastMessage();
    }

    interface presenter{
        void clickedToastButton();
    }

}
