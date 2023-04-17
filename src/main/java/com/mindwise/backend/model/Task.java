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
    private boolean default_flag;
    private String description;
    private String type;
    private String answer;

    public Task() {
    }

    public Task(boolean default_flag, String description, String type, String answer) {
        this.default_flag = default_flag;
        this.description = description;
        this.type = type;
        this.answer = answer;
    }

    public boolean isDefault_flag() {
        return default_flag;
    }

    public void setDefault_flag(boolean default_flag) {
        this.default_flag = default_flag;
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
