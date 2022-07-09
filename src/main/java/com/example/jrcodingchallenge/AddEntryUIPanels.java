package com.example.jrcodingchallenge;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddEntryUIPanels {
    public static Stage addItemStage(HelloApplication helloApplication){

        Scene addItemScene = new Scene(addItemAnchor(helloApplication),400,400);
        helloApplication.addItemStage.setTitle("Add Item");
        helloApplication.addItemStage.setAlwaysOnTop(true);
        helloApplication.addItemStage.setScene(addItemScene);
        helloApplication.addItemStage.show();
        return helloApplication.addItemStage;
    }

    public static AnchorPane addItemAnchor(HelloApplication helloApplication){

        helloApplication.addItemAnchor.getChildren().add(AddEntryUILabels.itemNameLabel(helloApplication));
        helloApplication.addItemAnchor.getChildren().add(AddEntryUILabels.itemAmountLabel(helloApplication));
        helloApplication.addItemAnchor.getChildren().add(AddEntryUILabels.itemPriceLabel(helloApplication));
        helloApplication.addItemAnchor.getChildren().add(AddEntryUILabels.itemNameText(helloApplication));
        helloApplication.addItemAnchor.getChildren().add(AddEntryUILabels.itemAmountText(helloApplication));
        helloApplication.addItemAnchor.getChildren().add(AddEntryUILabels.itemPriceText(helloApplication));
        helloApplication.addItemAnchor.getChildren().add(AddEntryUIButtons.btnSaveItem(helloApplication));
        return helloApplication.addItemAnchor;
    }
}
