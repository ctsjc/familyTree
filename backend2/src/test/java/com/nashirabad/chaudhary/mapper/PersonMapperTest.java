package com.nashirabad.chaudhary.mapper;

import com.nashirabad.chaudhary.beans.Person;
import com.nashirabad.chaudhary.db.dao.PersonDao;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PersonMapperTest {

    @org.junit.Test
    public void personToPersonDTO() {

        Person person = new Person();
        person.setFirstName("pradeep");

        PersonDao  personDao = PersonMapper.INSTANCE.personToPersonDTO(person);

        Assert.assertEquals("pradeep",personDao.getFirstName());
    }
}