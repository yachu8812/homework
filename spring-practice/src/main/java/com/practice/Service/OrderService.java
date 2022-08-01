package com.practice.Service;



import com.practice.Model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    List<Order> orderList = new ArrayList<>();
    List<Meal> ordermealList = new ArrayList<>();

    List<Turnover> Turnover = new ArrayList<>();

    public OrderService(){
        this.ordermealList = new ArrayList<>();
        this.ordermealList.add(new Meal("hamburger",100,""));
        //this.ordermealList.add(new Meal("do",100,""));
        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1,200,"Shery",ordermealList));

        this.Turnover = new ArrayList<>();
    }

    public Order getOrderByseq(int seq){
        for(int i = 0;i< orderList.size(); i++){
            if(this.orderList.get(i).getSeq() == seq){
                return this.orderList.get(i);
            }
        }
        return null;
    }

    public Turnover getTurnoverByTotalPrice(){

        if (orderList.size() != 0){
            int totalPrice = 0;
            for(int i = 0;i< orderList.size(); i++) {
                totalPrice += orderList.get(i).getTotalPrice();
            }
            Turnover.add(new Turnover(totalPrice));
            return Turnover.get(0);
        }
        Turnover.add(new Turnover(0));
        return Turnover.get(0);
    }




}
