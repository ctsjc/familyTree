package com.nashirabad.chaudhary.mapper;

import com.nashirabad.chaudhary.beans.Address;
import com.nashirabad.chaudhary.beans.Person;
import com.nashirabad.chaudhary.db.dao.AddressDao;
import com.nashirabad.chaudhary.db.dao.PersonDao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class);


    @Mapping(source = "firstName", target = "firstName")
    PersonDao personToPersonDTO(Person person);

    AddressDao addressToAddressDTO(Address address);
}
