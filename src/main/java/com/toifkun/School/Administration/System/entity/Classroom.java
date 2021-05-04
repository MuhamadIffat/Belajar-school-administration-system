package com.toifkun.School.Administration.System.entity;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private long id;

    private int start_year;

    private int end_year;

    private int year;

    private char letter;

    private Teacher headTeacher;

    private List<Student> students = new ArrayList<>();

    private List<TimeTableEntity> timeTableEntities = new ArrayList<>();

    public Classroom(int start_year, int end_year, int year, char letter, Teacher headTeacher) {
        this.start_year = start_year;
        this.end_year = end_year;
        this.year = year;
        this.letter = letter;
        this.headTeacher = headTeacher;
    }
}
