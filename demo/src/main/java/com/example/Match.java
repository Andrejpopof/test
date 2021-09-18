package com.example;

import java.util.Date;



public class Match {
    
    enum Status{
        ended,
        active,
        scheduled
    }

    private String name;
    private String type;
    private Status status;
    private String dateScheduled;
    private String dateFinished;
    private String city;
    private String stadium;
    private String score;
    private long id;


    // public Match(){

    // }
  

    public Match(String name, String type, Status status, String dateScheduled, String dateFinished, String city,
            String stadium, String score, long id) {
        
        this.name = name;
        this.type = type;
        this.status = status;
        this.dateScheduled = dateScheduled;
        this.dateFinished = dateFinished;
        this.city = city;
        this.stadium = stadium;
        this.score = score;
        this.id = id;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public String getDateScheduled() {
        return dateScheduled;
    }
    public void setDateScheduled(String dateScheduled) {
        this.dateScheduled = dateScheduled;
    }
    public String getDateFinished() {
        return dateFinished;
    }
    public void setDateFinished(String dateFinished) {
        this.dateFinished = dateFinished;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStadium() {
        return stadium;
    }
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    
    
}
