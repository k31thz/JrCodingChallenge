package com.example.jrcodingchallenge;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Json {
    public static void json(HelloApplication helloApplication){

        try{
            JsonElement inputElement = JsonParser.parseReader(new FileReader(helloApplication.input));
            JsonObject inputObject = inputElement.getAsJsonObject();
            helloApplication.rows = inputObject.getAsJsonObject("config").get("rows").getAsInt();
            helloApplication.columns = inputObject.getAsJsonObject("config").get("columns").getAsInt();
            helloApplication.jsonItems = inputObject.get("items").getAsJsonArray();
            for (JsonElement itemElement: helloApplication.jsonItems){
                JsonObject itemObjc = itemElement.getAsJsonObject();
                String name = itemObjc.get("name").getAsString();
                Integer amount = itemObjc.get("amount").getAsInt();
                String price = itemObjc.get("price").getAsString();
                Item item = new Item(name,amount,price);
                helloApplication.items.add(item);
            }
        }
        catch(FileNotFoundException e){
        }
    }
}
