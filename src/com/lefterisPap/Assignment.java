package com.lefterisPap;

import java.time.LocalDate;

public class Assignment {

    private String title;
    private String description;
    private LocalDate subDateTime;

    public Assignment(String title,String description,LocalDate subDateTime){
        this.title=title;
        this.description=description;
        this.subDateTime=subDateTime;
    }

    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public LocalDate getSubDateTime(){
        return subDateTime;
    }
    public void setTitle(String newTitle){
        this.title=newTitle;
    }
    public void setDescription(String newDescription){
        this.description=newDescription;
    }
    public void setSubDateTime(LocalDate newSubDateTime){
        this.subDateTime=newSubDateTime;
    }
}
