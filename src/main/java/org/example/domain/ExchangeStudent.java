package org.example.domain;

import java.util.Objects;

public class ExchangeStudent extends Student {

    public ExchangeStudent(String name) {
        super(name);
    }

    public void enroll(Semester semester) {
        /*
            If student doesn't come from exchange && student was not already enrolled in the previous semester
         */
        if (Objects.isNull(semester) || !Objects.equals(semester.predecessor, enrolled)) {
            throw new IllegalArgumentException();
        }
        this.enrolled = semester;
    }
}
