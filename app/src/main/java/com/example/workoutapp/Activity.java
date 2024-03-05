package com.example.workoutapp;

class Activity{
    private String name;
    private boolean includesWeight;
    public Activity(String name, boolean includesWeight){
        this.name = name;
        this.includesWeight = includesWeight;
    }

    public String getName(){
        return name;
    }

    public boolean HasWeight(){
        return includesWeight;
    }

    public void logWorkout(){

    }

    private void calculateScore(){

    }
}