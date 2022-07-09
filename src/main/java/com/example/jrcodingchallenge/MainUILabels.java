package com.example.jrcodingchallenge;

import javafx.scene.control.Label;

public class MainUILabels {
    public static Label moneyLabel(HelloApplication helloApplication) {
        helloApplication.moneyLabel.minWidth(80);
        helloApplication.moneyLabel.layoutXProperty().set(1000);
        helloApplication.moneyLabel.layoutYProperty().set(780);
        helloApplication.moneyLabel.setText("$"+0.00);

        return helloApplication.moneyLabel;
    }

    public static Label notifyLabel(HelloApplication helloApplication){
        helloApplication.notifyLabel.setText("Welcome!\n\nEnter Selection");
        return helloApplication.notifyLabel;
    }

    public static Label logLabel(HelloApplication helloApplication){

        helloApplication.logLabel.setText("wadasdasdasd");
        return helloApplication.logLabel;
    }
}
