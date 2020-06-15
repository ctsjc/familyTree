package com.nashirabad.chaudhary.mapper;

import com.nashirabad.chaudhary.beans.Address;
import com.nashirabad.chaudhary.db.dao.AddressDao;
import org.mapstruct.factory.Mappers;

public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper( AddressMapper.class);

    AddressDao addressToAddressDTO(Address person);
}
