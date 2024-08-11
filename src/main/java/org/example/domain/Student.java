package org.example.domain;

import org.springframework.util.StringUtils;

public class Student {
    public String name;
    public Semester enrolled;

    public Student(String name) {
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    /*
        This class looks like it is doing 2 things :
        - creating a normal student (not from exchange)
        - creating an exchange student
        So, each time we need to add a diff type of student, we need to overload this class with the methods associated to it : wrong
     */

//    public static Student createStudent(String name){
//        return new Student(name,false);
//    }
//    public static Student createFromExchangeStudent(String name){
//        return new Student(name,true);
//    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Semester getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Semester enrolled) {
        this.enrolled = enrolled;
    }
}

