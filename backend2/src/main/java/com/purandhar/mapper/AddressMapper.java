package com.purandhar.mapper;

import com.purandhar.beans.Address;
import com.purandhar.db.dao.AddressDao;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper( AddressMapper.class);

    AddressDao addressToAddressDTO(Address person);
}
