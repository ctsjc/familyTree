package com.nashirabad.chaudhary.db.dao;

import lombok.Data;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@With
@Document(collection = "Address")

public class AddressDao {
    @Id
    private String id;

    private String place;
}
