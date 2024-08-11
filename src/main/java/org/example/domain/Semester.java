package org.example.domain;

public class Semester {
    public Semester predecessor;

    public String courseName;

    public Semester(String courseName) {
        this.predecessor = null;
        this.courseName = courseName;
    }

    public Semester getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Semester predecessor) {
        this.predecessor = predecessor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
