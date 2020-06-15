package com.nashirabad.chaudhary.db.repository;

import com.nashirabad.chaudhary.db.dao.PersonDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepository extends MongoRepository<PersonDao, String> {
    @Query("{ 'father.firstName' : ?0 }")
    List<PersonDao> findByFather(String father);
}
//dashrath