package com.example.datebook.models;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Event extends RealmObject {

    @PrimaryKey
    private int id;
    private long eventStart;
    private long eventFinish;
    private String eventName;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getEventStart() {
        return eventStart;
    }

    public void setEventStart(long eventStart) {
        this.eventStart = eventStart;
    }

    public long getEventFinish() {
        return eventFinish;
    }

    public void setEventFinish(long eventFinish) {
        this.eventFinish = eventFinish;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
