package com.bruno.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.personapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
