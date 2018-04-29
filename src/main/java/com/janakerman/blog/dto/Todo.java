package com.janakerman.blog.dto;

public class Todo {

    private String title;
    private String description;

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    static Todo of(String title, String description) {
        return new Todo(title, description);
    }

}
