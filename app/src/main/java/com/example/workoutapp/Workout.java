package com.example.workoutapp;

import java.util.ArrayList;

class Workout{
    String name;
    ArrayList<Activity> ActivityList;


    public Workout(String name){
        this.name = name;
        this.ActivityList = new ArrayList<Activity>();
    }

    public void addActivity(Activity newActivity){
        if(ActivityList.contains(newActivity)) {
            return;
        }else{
            ActivityList.add(newActivity);
        }
    }

    public void removeActivity(Activity activityToRemove){
        if(!ActivityList.contains(activityToRemove)) {
            return;
        }else{
            ActivityList.remove(activityToRemove);
        }
    }
}