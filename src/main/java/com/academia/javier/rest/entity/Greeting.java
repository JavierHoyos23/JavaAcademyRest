package com.academia.javier.rest.entity;

public class Greeting {
    private String message;
    private String name = "Javier";

    public Greeting(String message){
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
