package com.example.jrcodingchallenge;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class MainUIPanels {
    public static GridPane grid(HelloApplication helloApplication){
        helloApplication.vendingLayout.getChildren().clear();
        helloApplication.vendingLayout.setHgap(40);
        helloApplication.vendingLayout.setVgap(40);
        helloApplication.vendingLayout.setPadding(new Insets(15,15,15,15));
        Font font = Font.font("Montserrat", FontWeight.BOLD, FontPosture.REGULAR,12);
        int count = 0;
        int ascii = 65;
        for(int row = 0; row<= helloApplication.rows; row++) {
            for (int col = 0; col <= helloApplication.columns; col++) {
                Label rowLbl = new Label("");
                Label colLbl = new Label("");
                Label cellName = new Label("");
                rowLbl.setFont(font);
                colLbl.setFont(font);
                cellName.setFont(font);
                char c = (char) ascii;
                if (row == 0 && col == 0) {
                    helloApplication.vendingLayout.getChildren().add(cellName);
                    GridPane.setConstraints(cellName, col, row);
                } else if (row == 0 || col == 0) {
                    if (col == 0) {
                        rowLbl.setText("" + c);
                        helloApplication.vendingLayout.getChildren().add(rowLbl);
                        GridPane.setValignment(rowLbl, VPos.CENTER);
                        GridPane.setConstraints(rowLbl, col, row);
                        ascii++;
                    }
                    if (row == 0) {
                        colLbl.setText("" + col);
                        helloApplication.vendingLayout.getChildren().add(colLbl);
                        GridPane.setHalignment(colLbl, HPos.CENTER);
                        GridPane.setConstraints(colLbl, col, row);
                    }
                } else {
                    if(helloApplication.items.size() > count){
                        String name = helloApplication.items.get(count).getName();
                        Integer amount = helloApplication.items.get(count).getAmount();
                        String price = helloApplication.items.get(count).getPrice();
                        cellName.setText(""+name+"\n"+price+"\nPcs: "+amount);
                    }
                    else{
                        cellName.setText("");
                    }
                    helloApplication.vendingLayout.getChildren().add(cellName);
                    GridPane.setHalignment(cellName,HPos.CENTER);
                    GridPane.setConstraints(cellName, col, row);
                    count++;
                }
            }
        }
        return helloApplication.vendingLayout;
    }

    public static AnchorPane anchorPane(HelloApplication helloApplication){
        helloApplication.anchor.getChildren().add(grid(helloApplication));
        helloApplication.anchor.getChildren().add(helloApplication.btnA());
        helloApplication.anchor.getChildren().add(helloApplication.btnB());
        helloApplication.anchor.getChildren().add(helloApplication.btnC());
        helloApplication.anchor.getChildren().add(helloApplication.btnD());
        helloApplication.anchor.getChildren().add(helloApplication.btn1());
        helloApplication.anchor.getChildren().add(helloApplication.btn2());
        helloApplication.anchor.getChildren().add(helloApplication.btn3());
        helloApplication.anchor.getChildren().add(helloApplication.btn4());
        helloApplication.anchor.getChildren().add(helloApplication.btn5());
        helloApplication.anchor.getChildren().add(helloApplication.btn6());
        helloApplication.anchor.getChildren().add(helloApplication.btn7());
        helloApplication.anchor.getChildren().add(helloApplication.btn8());
        //anchor.getChildren().add(btn9());
        helloApplication.anchor.getChildren().add(helloApplication.btnSet());
        helloApplication.anchor.getChildren().add(helloApplication.btnClear());
        helloApplication.anchor.getChildren().add(helloApplication.btnPenny());
        helloApplication.anchor.getChildren().add(helloApplication.btnDime());
        helloApplication.anchor.getChildren().add(helloApplication.btnNickel());
        helloApplication.anchor.getChildren().add(helloApplication.btnQuarter());
        helloApplication.anchor.getChildren().add(helloApplication.btnHalf());
        helloApplication.anchor.getChildren().add(helloApplication.addItem());
        helloApplication.anchor.getChildren().add(notifyPane(helloApplication));
        helloApplication.anchor.getChildren().add(logPane(helloApplication));
        helloApplication.anchor.getChildren().add(MainUILabels.moneyLabel(helloApplication));

        return helloApplication.anchor;
    }

    public static Pane notifyPane(HelloApplication helloApplication){

        helloApplication.notifyPane.setStyle("-fx-border-color:red");
        helloApplication.notifyPane.layoutXProperty().set(30);
        helloApplication.notifyPane.layoutYProperty().set(450);
        helloApplication.notifyPane.setMinSize(850,140);
        helloApplication.notifyPane.getChildren().add(MainUILabels.notifyLabel(helloApplication));
        return helloApplication.notifyPane;
    }

    public static Pane logPane(HelloApplication helloApplication){
        helloApplication.logPane.setStyle("-fx-border-color:black");
        helloApplication.logPane.layoutXProperty().set(950);
        helloApplication.logPane.layoutYProperty().set(20);
        helloApplication.logPane.setMinSize(300,650);
        helloApplication.logPane.setMaxSize(300,650);
        helloApplication.logPane.getChildren().add(MainUILabels.logLabel(helloApplication));
        return helloApplication.logPane;
    }

}
