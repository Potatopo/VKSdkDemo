package com.potato.listdemo;

/**
 * Created by potato on 5/23/16.
 */
public class User {

    private final String name;
    private final String city;
    private final String country;
    private final Boolean online;

    public User(String name, String city, String country, Boolean online) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.online = online;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public String getCountry(){
        return country;
    }

    public Boolean getOnline(){
        return online;
    }

}
