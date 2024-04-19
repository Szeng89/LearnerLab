package io.zipcoder.Tests;

import Classes.Instructor;
import Classes.Person;
import Classes.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor  {

    @Test
    public void implementationTest() {
        Instructor dolio = new Instructor(99, "Dolio");

        Assert.assertTrue(dolio instanceof Teacher);
        Assert.assertEquals(99,dolio.getId());
    }

    @Test
    public void inheritanceTest() {
        Instructor dolio = new Instructor(99, "Dolio");

        Assert.assertTrue(dolio instanceof Person);
    }

    @Test
    public void teachTest() {
        Instructor dolio = new Instructor(99, "Dolio");
        Student shijin = new Student(23, "Shijin", 12.00);

        dolio.teach(shijin,3);

        Assert.assertEquals(15.00,shijin.getTotalStudyTime(), .0001);
    }

    @Test
    public void lectureTest() {
        Instructor dolio = new Instructor(99, "Dolio");
        Student studentUno = new Student(77, "Moe", 10.00);
        Student studentDos = new Student(55, "Gary", 0.00);
        Student[] students = new Student[]{studentUno, studentDos};
        dolio.lecture(students, 10.00);

        Assert.assertEquals(15.00, studentUno.getTotalStudyTime(), .0001);



    }
}
