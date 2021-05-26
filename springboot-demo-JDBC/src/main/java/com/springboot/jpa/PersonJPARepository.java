package com.springboot.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.jdbc.Person;

@Repository
@Transactional
public class PersonJPARepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);//JPA
	}
	
	public Person updatePerson(Person person) {
		return entityManager.merge(person);//JPA
	}
	public Person insertPerson(Person person) {
		return entityManager.merge(person);//JPA
	}
	
	public void deletePersonById(int id) {
		Person person = findById(id);
		entityManager.remove(person);//JPA
	}
	
	//JPQL Java Persistence Query Language - Giving query a name and using it.
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}
}
