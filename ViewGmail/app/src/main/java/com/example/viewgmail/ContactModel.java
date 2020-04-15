package com.example.viewgmail;

public class ContactModel
{
    String name, subject, content, time, color;
    boolean star;

    public ContactModel(String name, String subject, String content, String time, String color) {
        this.name = name;
        this.subject = subject;
        this.content = content;
        this.time = time;
        this.color = color;
        this.star = false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }


}
