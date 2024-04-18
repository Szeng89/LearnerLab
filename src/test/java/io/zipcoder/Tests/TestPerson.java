package io.zipcoder.Tests;

import Classes.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testSetGetName() {
        Person person1 = new Person();
        String expectedName = "Shijin";

        person1.setName(expectedName);

        Assert.assertEquals(person1.getName(), "Shijin");
    }

    @Test
    public void testSet() {
        Person person1 = new Person();
        person1.setName("LeeBron-James");

        Assert.assertEquals(person1.getName(),"LeeBron-James");
    }

}
