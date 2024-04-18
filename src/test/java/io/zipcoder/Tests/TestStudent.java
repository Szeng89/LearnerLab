package io.zipcoder.Tests;

import Classes.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest() {
        Student Shijin = new Student();

        Assert.assertTrue(Shijin instanceof Learner);
    }

    @Test
    public void LearnTest() {
        Student person = new Student(6, "Leebron", 10.0);
        person.learn(15.0);


        Assert.assertEquals(25.0, person.getTotalStudyTime(), .00001);
    }
}
