package com.springboot.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jdbc.Person;

public interface PersonDataJPARepository extends JpaRepository<Person, Integer>{

}
