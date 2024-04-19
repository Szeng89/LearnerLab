package io.zipcoder.Tests;

import Classes.Instructor;
import Classes.People;
import Classes.Person;
import Classes.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPeople
{
    @Test
    public void testAddPerson(){
        People people = new People();
        Person person1 = new Person(1,"Shijin");
        people.addPerson(person1);
        Assert.assertEquals(true,people.contains(person1));

    }

    @Test
    public void testRemovePerson(){
        People people = new People();
        Person person1 = new Person(1,"Shijin");
        people.addPerson(person1);
        Assert.assertEquals(true,people.contains(person1));

        people.remove(person1);
        Assert.assertTrue(!people.contains(person1));

    }

    @Test
    public void testRemoveById() {
        People people = new People();
        Person person1 = new Person(1,"Shijin");
        people.addPerson(person1);
        Assert.assertEquals(true,people.contains(person1));

        people.remove(1);

        Assert.assertTrue(!people.contains(person1));

    }

    @Test
    public void getTest() {
        ArrayList<Person> people = new ArrayList<>();
        Person student = new Person(2, "DikshaDontKillMe");

        Assert.assertEquals(0,people.size());

        people.add(student);
        Assert.assertEquals(1,people.size());

        Assert.assertEquals(student, people.get(0));
    }

    @Test
    public void findById() {
        People people = new People();
        Person student = new Person(2L, "DikshaDontKillMe");

        people.addPerson(student);

        Assert.assertEquals(student, people.findById(2L));
    }
}
