package com.purandhar.controller;

import com.purandhar.beans.Person;
import com.purandhar.service.PersonCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonCRUDService personService;

    @RequestMapping(method = RequestMethod.POST, value = "/save", consumes = "application/json")
    public int savePerson(@RequestBody Person person){
        System.out.println(person);
        personService.savePerson(person);
        return 0;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAll")
    public List<Person> greeting() {
        return personService.getPerson();
    }

    @GetMapping("/get/{father}/immediate")
    public List<Person> getImmediateFamily(@PathVariable String father) {
        return personService.findByFather(father);
    }

    @GetMapping("/get/{father}")
    public List<Person> getFamily(@PathVariable String father) {
        return personService.findByFather(father);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/save1", consumes = "application/json")
    public int savePerson(@RequestBody(required = false) String person){
        System.out.println("I got you"+person);
        return 0;
    }

}
