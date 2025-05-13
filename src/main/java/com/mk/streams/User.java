package com.mk.streams;

import java.util.logging.Logger;

public class User {
    private int id;
    private String name;
    private Boolean isWorking;

    private Logger logger = Logger.getLogger(this.getClass().getName());

    public User(int id, String name, Boolean isWorking) {
        this.id = id;
        this.name = name;
        this.isWorking = isWorking;
    }

    @Override
    public String toString() {
        logger.info(id + " " + name + " " + isWorking);
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }
}
