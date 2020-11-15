package com.lefterisPap;

import java.time.LocalDate;

public class AssignmentPerStudent {
    private Assignment persAssignment;
    private LocalDate deliveryDate;
    private String oralMark;
    private String totalMark;

    public AssignmentPerStudent(Assignment persAssignment,LocalDate deliveryDate,
                                String oralMark,String totalMark){
        this.persAssignment=persAssignment;
        this.deliveryDate=deliveryDate;
        this.oralMark=oralMark;
        this.totalMark=totalMark;
    }
    public Assignment getPersAssignment(){
        return persAssignment;
    }
    public LocalDate getDeliveryDate(){
        return deliveryDate;
    }
    public String getOralMark(){
        return oralMark;
    }
    public String getTotalMark(){
        return totalMark;
    }
    public void setPersAssignment(Assignment newPersAssignment){
        this.persAssignment=newPersAssignment;
    }
    public void setDeliveryDate(LocalDate newDeliveryDate){
        this.deliveryDate=newDeliveryDate;
    }
    public void setOralMark(String newOralMark){
        this.oralMark=newOralMark;
    }
    public void setTotalMark(String newTotalMark){
        this.totalMark=newTotalMark;
    }
}
