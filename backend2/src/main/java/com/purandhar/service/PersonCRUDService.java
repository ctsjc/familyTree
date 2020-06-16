package com.purandhar.service;

import com.purandhar.beans.Person;
import com.purandhar.db.dao.PersonDao;
import com.purandhar.db.repository.PersonRepository;
import com.purandhar.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonCRUDService {

    @Autowired
    PersonRepository personRepository;

    public void savePerson(Person person){
        PersonDao personDao= PersonMapper.INSTANCE.personToPersonDTO(person);
        System.out.println(personDao);
        personRepository.save(personDao);
    }

    public List<Person> getPerson(){
        
       List<PersonDao> personDaos = personRepository.findAll();
        List<Person> persons = new ArrayList<>(personDaos.size());
        personDaos.stream().forEach(personDao->{
            System.out.println(personDao);
            Person person=new Person();
            personDTOtoBean(personDao, person);
            persons.add(person);
        });

        return persons;

    }

    private void personDTOtoBean(PersonDao dto, Person bean) {
        bean.setFirstName(dto.getFirstName());
        bean.setGender(dto.getGender());


        if (dto.getFather() != null) {
            bean.setFather(new Person());
            personDTOtoBean(dto.getFather(), bean.getFather());
        }
        if (dto.getMother() != null) {
            bean.setMother(new Person());
            personDTOtoBean(dto.getMother(), bean.getMother());
        }
        if (dto.getSpouse() != null) {
            bean.setSpouse(new Person());
            personDTOtoBean(dto.getSpouse(), bean.getSpouse());
        }
    }

    public List<Person> findByFather(String father) {
       List<PersonDao> personDaos = personRepository.findByFather(father);
        List<Person> persons = new ArrayList<>(personDaos.size());
        personDaos.stream().forEach(personDao->{
            System.out.println(personDao);
            Person person=new Person();
            personDTOtoBean(personDao, person);
            persons.add(person);
        });

        return persons;
    }
}
