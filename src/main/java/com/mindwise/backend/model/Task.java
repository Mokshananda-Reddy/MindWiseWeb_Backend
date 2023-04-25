package com.mindwise.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {

    public Long getTaskID() {
        return taskID;
    }

    public void setTaskID(Long taskID) {
        this.taskID = taskID;
    }

    @Id
    @GeneratedValue
    private Long taskID;
    private Long defaultflag;
    private String description;
    private String type;
    private String answer;

    public Task() {
    }

    public Task(Long defaultflag, String description, String type, String answer) {
        this.defaultflag = defaultflag;
        this.description = description;
        this.type = type;
        this.answer = answer;
    }

    public Long getDefaultflag() {
        return defaultflag;
    }

    public void setDefaultflag(Long defaultflag) {
        this.defaultflag = defaultflag;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
