package com.example.springdemo.personImport

import com.example.springdemo.entity.Person
import com.example.springdemo.person.PersonRepository
import org.springframework.stereotype.Service

interface ImportPersonService {
    fun importPersonFromJSON(persons: List<Person>)
}

@Service
class DefaultImportPersonService(private val personRepository: PersonRepository): ImportPersonService {
    override fun importPersonFromJSON(persons: List<Person>) {
        personRepository.saveAll(persons)
    }
}