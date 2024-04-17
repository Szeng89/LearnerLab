package io.zipcoder.interfaces;

import Interface.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id, String name, Double totalStudyTime) {
        super(id,name);
        this.totalStudyTime = totalStudyTime;
    }

    public Student(){}

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;

    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
