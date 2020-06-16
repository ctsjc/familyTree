package com.purandhar.db.dao;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "AddressDao{" +
                "id='" + id + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
