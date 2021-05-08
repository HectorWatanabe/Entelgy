package com.hector.entelgy.models;

public class User {

    private final String data;

    public User(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "User{" +
                "data='" + data + '\'' +
                '}';
    }
}
