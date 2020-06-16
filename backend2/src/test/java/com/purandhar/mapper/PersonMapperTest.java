package com.purandhar.mapper;

import com.purandhar.beans.Person;
import com.purandhar.db.dao.PersonDao;
import org.junit.Assert;

public class PersonMapperTest {

    @org.junit.Test
    public void personToPersonDTO() {

        Person person = new Person();
        person.setFirstName("pradeep");

        PersonDao personDao = PersonMapper.INSTANCE.personToPersonDTO(person);

        Assert.assertEquals("pradeep",personDao.getFirstName());
    }
}