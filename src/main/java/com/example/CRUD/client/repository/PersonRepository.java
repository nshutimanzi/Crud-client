package com.example.CRUD.client.repository;

import com.example.CRUD.client.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
