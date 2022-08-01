package com.practice.Service;


import com.practice.Model.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {

    List<Meal> MealList = new ArrayList<>();

    public MealService (){
        this.MealList = new ArrayList<>();
        this.MealList.add(new Meal("hamburger",100,"This is delicious"));
    }

    public Meal getMealByName(String name) {
        for (int i = 0; i < MealList.size(); i++) {
            if (MealList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                return MealList.get(i);
            }
        }
        return null;
    }
}
