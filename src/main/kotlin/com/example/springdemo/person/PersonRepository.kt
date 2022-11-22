package com.example.springdemo.person

import com.example.springdemo.entity.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
@Transactional
interface PersonRepository: JpaRepository<Person, String> {
    fun findByFirstName(firstName: String): Person?
}