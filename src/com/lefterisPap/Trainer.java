package com.lefterisPap;

public class Trainer {

    private String firstName;
    private String lastName;
    private StreamPerCourse subject;

    public Trainer(String fname,String lname,StreamPerCourse subject){
        this.firstName=fname;
        this.lastName=lname;
        this.subject=subject;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public StreamPerCourse getSubject(){
        return subject;
    }

    public void setFirstName(String newName){
        this.firstName=newName;
    }
    public void setLastName(String newLname){
        this.lastName=newLname;
    }

    //????? list of trainer
    public void showTrainers(){

    }


    @Override
    public String toString() {
        return "Trainer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject=" + subject +
                '}';
    }
}
