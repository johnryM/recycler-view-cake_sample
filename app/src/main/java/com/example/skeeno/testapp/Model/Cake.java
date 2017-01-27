package com.example.skeeno.testapp.Model;

/**
 * Created by skeeno on 26/01/2017.
 */

public class Cake {

    private String name;
    private double price;
    private int numOfSlices;

    public Cake() {
        //empty
    }

    public Cake(String name, double price, int numOfSlices) {
        this.name = name;
        this.price = price;
        this.numOfSlices = numOfSlices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSlices() {
        return numOfSlices;
    }

    public void setNumOfSlices(int numOfSlices) {
        this.numOfSlices = numOfSlices;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
