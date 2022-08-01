package com.practice.Model;

import java.util.List;

public class Order {
    private int seq;
    private int totalPrice;
    private String waiter;
    private List<Meal> meals;

    public Order(int seq,int totalPrice,String waiter,List<Meal> meals){
        this.seq = seq;
        this.totalPrice = totalPrice;
        this.waiter = waiter;
        this.meals = meals;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public int getSeq() {
        return seq;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getWaiter() {
        return waiter;
    }

    public List<Meal> getMeals() {
        return meals;
    }
}
