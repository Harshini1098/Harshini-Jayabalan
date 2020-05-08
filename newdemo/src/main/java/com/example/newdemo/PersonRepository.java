package com.example.newdemo;

import org.springframework.data.repository.CrudRepository;
import com.example.newdemo.Person;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface PersonRepository extends CrudRepository<Person, Integer> {
}
