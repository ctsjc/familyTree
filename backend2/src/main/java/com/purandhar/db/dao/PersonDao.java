package com.purandhar.db.dao;

import lombok.Data;
import lombok.ToString;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@With
@ToString
@Document(collection = "Person")

public class PersonDao {
    @Id
    private String id;

    private String firstName;

    private String gender;
    private PersonDao father;

    private PersonDao mother;

    private PersonDao spouse;
    private AddressDao current;
    private AddressDao origin;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PersonDao getFather() {
        return father;
    }

    public void setFather(PersonDao father) {
        this.father = father;
    }

    public PersonDao getMother() {
        return mother;
    }

    public void setMother(PersonDao mother) {
        this.mother = mother;
    }

    public PersonDao getSpouse() {
        return spouse;
    }

    public void setSpouse(PersonDao spouse) {
        this.spouse = spouse;
    }

    public AddressDao getCurrent() {
        return current;
    }

    public void setCurrent(AddressDao current) {
        this.current = current;
    }

    public AddressDao getOrigin() {
        return origin;
    }

    public void setOrigin(AddressDao origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "PersonDao{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                ", spouse=" + spouse +
                ", current=" + current +
                ", origin=" + origin +
                '}';
    }
}
