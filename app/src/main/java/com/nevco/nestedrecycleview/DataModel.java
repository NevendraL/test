package com.nevco.nestedrecycleview;

import java.util.ArrayList;

public class DataModel {
    private String name;
    private String age;

    private ArrayList<DataModel> eventsDatesList = new ArrayList<>();



    public DataModel(){

    }


    public ArrayList<DataModel> getEventsDatesList() {
        return eventsDatesList;

    }

    public DataModel(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
