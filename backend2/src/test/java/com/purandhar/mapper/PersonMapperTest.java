package com.purandhar.mapper;

import com.purandhar.beans.Address;
import com.purandhar.beans.Person;
import com.purandhar.db.dao.AddressDao;
import com.purandhar.db.dao.PersonDao;
import org.junit.Assert;
import org.junit.Test;

public class PersonMapperTest {

    @org.junit.Test
    public void personToPersonDTO() {

        Person person = getPerson();
        person.setCurrent(getAddress());
        person.setOrigin(getAddress());

        PersonDao personDao = PersonMapper.INSTANCE.personToPersonDTO(person);
        System.out.println(personDao);
        Assert.assertEquals("pradeep",personDao.getFirstName());

    }

    private Person getPerson() {
        Person person = new Person();
        person.setFirstName("pradeep");
        return person;
    }

    @Test
    public void testAddressMapper() {
        Address currentAddress = getAddress();
        AddressDao addressDao = AddressMapper.INSTANCE.addressToAddressDTO(currentAddress);
        System.out.println(addressDao);
    }

    private Address getAddress() {
        Address address = new Address();
        address.setPlace("pune");
        return address;
    }
}