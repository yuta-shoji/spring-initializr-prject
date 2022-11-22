package com.example.springdemo.person

import com.example.springdemo.entity.Person
import org.springframework.stereotype.Service

interface PersonService {
    fun searchPerson(): List<Person>
    fun personBy(firstName: String): Person?
}

@Service
class DefaultPersonService(private val personRepository: PersonRepository): PersonService {
    override fun searchPerson(): List<Person> {
        return personRepository.findAll()
    }

    override fun personBy(firstName: String): Person? {
        return personRepository.findByFirstName(firstName)
    }
}
