package com.lefterisPap;

import java.time.LocalDate;
import database.SchoolDatabase;

import java.util.ArrayList;
import static database.SchoolDatabase.students;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students= SchoolDatabase.students;

        for (Student current:students){
            current.giveBasicStatsForStuds();
        }


    }
}
