package org.example;

import org.assertj.core.api.Assertions;
import org.example.domain.ExchangeStudent;
import org.example.domain.Semester;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StudentServiceTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void exchange_student_wanting_to_enroll_in_sem_without_predecessor_() {
        Semester physicsSemester2 = new Semester("physics");

        ExchangeStudent student = new ExchangeStudent("Abir");
        Semester mathsSemester1 = new Semester("maths");

        physicsSemester2.setPredecessor(mathsSemester1);
        student.setEnrolled(mathsSemester1);


        student.enroll(physicsSemester2);

        Assertions.assertThat(student.enrolled).isEqualTo(physicsSemester2);
    }
}
