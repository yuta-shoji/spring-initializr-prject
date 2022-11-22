package com.example.springdemo.person

import com.example.springdemo.entity.Person
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person")
class PersonController(private val PersonService: PersonService) {
    @GetMapping
    fun searchPerson(): List<Person> {
        return PersonService.searchPerson()
    }

    @GetMapping("/{firstName}")
    fun personBy(
        @PathVariable firstName: String,
    ): Person? {
        return PersonService.personBy(firstName)
    }
}