package com.purandhar.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Person {
    private String firstName;
    private String gender;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate deathDate=null;

    private Address current;
    private Address origin;

    private Person father;
    private Person mother;
    private Person spouse;


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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public Address getCurrent() {
        return current;
    }

    public void setCurrent(Address current) {
        this.current = current;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        father.setGender(PersonConstants.maleGender);
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        mother.setGender(PersonConstants.femaleGender);
        this.mother = mother;
    }

    public Person getSpouse() {

        return spouse;
    }

    public void setSpouse(Person spouse) {
        if(this.gender == PersonConstants.femaleGender){
            spouse.setGender(PersonConstants.maleGender);
        }else{
            spouse.setGender(PersonConstants.femaleGender);
        }
        this.spouse = spouse;
    }
}
