package io.zipcoder.interfaces;

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

}
