package com.purandhar.mapper;

import com.purandhar.beans.Address;
import com.purandhar.beans.Person;
import com.purandhar.db.dao.AddressDao;
import com.purandhar.db.dao.PersonDao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class);


    @Mapping(source = "firstName", target = "firstName")
    PersonDao personToPersonDTO(Person person);

    AddressDao addressToAddressDTO(Address address);
}
