package io.zipcoder.Tests;

public interface Teacher {
    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);
}
