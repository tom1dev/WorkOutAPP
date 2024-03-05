package com.example.workoutapp;

import java.util.ArrayList;

class Activity{
    private String name;
    private boolean includesWeight;
    Double currentsetscore;

    //list of set info (Rep,Weight)
    ArrayList<ArrayList<Double>> currentSetList;

    ArrayList<ArrayList<Double>> previousSetLists;
    public Activity(String name, boolean includesWeight){
        this.name = name;
        this.includesWeight = includesWeight;
        currentSetList = new ArrayList<ArrayList<Double>>();
        //Add this activity to DB or Find DB infomation
    }

    public String getName(){
        return name;
    }

    public boolean HasWeight(){
        return includesWeight;
    }

    public void inputSet(int rep,double weight){
        ArrayList<Double> newSet = new ArrayList<Double>();
        newSet.add(Double.valueOf(rep));
        newSet.add(weight);
        currentSetList.add(newSet);
    }

    private Double calculateScore(ArrayList<ArrayList<Double>> SetList){
        double SetScore = 0;

        for(int i = 0; i<SetList.size();i++){
            SetScore += SetList.get(i).get(0) * SetList.get(i).get(1);
        }
        return SetScore;
    }

    private Double ScoreDifference(){
        return calculateScore(currentSetList)-calculateScore(previousSetLists);
    }
}