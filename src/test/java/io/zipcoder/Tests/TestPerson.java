package io.zipcoder.Tests;

import Classes.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void setGetNameTest() {
        Person person1 = new Person(1,"Shijin");
        String expectedName = "Shijin";

        person1.setName(expectedName);

        Assert.assertEquals("Shijin", person1.getName());
    }

    @Test
    public void setTest() {
        Person person1 = new Person(1,"Shijin");
        person1.setName("LeeBron-James");

        Assert.assertEquals("LeeBron-James", person1.getName());
    }

}
