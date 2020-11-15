package com.lefterisPap;

import java.util.ArrayList;

public class Stream {
    private String title;
    private String type;
    private ArrayList<Assignment> assign;


    public Stream(String title,String type,ArrayList<Assignment> assign){
        this.title=title;
        this.type=type;
        this.assign=assign;
    }

    public String getTitle(){
        return title;
    }
    public String getType(){
        return type;
    }
    public ArrayList<Assignment> getAssign(){
        return assign;
    }
    public void setTitle(String newTitle){
        this.title=newTitle;
    }
    public void setType(String newType){
        this.type=newType;
    }
    public void setAssign(ArrayList<Assignment> newAssign){
        this.assign=newAssign;
    }

    


}
