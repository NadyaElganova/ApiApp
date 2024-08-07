package com.example.apiapp;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    // Геттер для userId
    public int getUserId() {
        return userId;
    }

    // Сеттер для userId
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Геттер для id
    public int getId() {
        return id;
    }

    // Сеттер для id
    public void setId(int id) {
        this.id = id;
    }

    // Геттер для title
    public String getTitle() {
        return title;
    }

    // Сеттер для title
    public void setTitle(String title) {
        this.title = title;
    }

    // Геттер для body
    public String getBody() {
        return body;
    }

    // Сеттер для body
    public void setBody(String body) {
        this.body = body;
    }

}

