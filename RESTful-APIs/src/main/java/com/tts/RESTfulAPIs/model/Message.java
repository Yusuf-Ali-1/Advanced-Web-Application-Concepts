package com.tts.RESTfulAPIs.model;

public class Message {
    private final long id;
    private final String greeting;
    private final String name;

    public Message(long id, String greeting, String name) {
        this.id = id;
        this.greeting = greeting;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", greeting='" + greeting + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
