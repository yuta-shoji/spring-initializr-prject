package com.example.springdemo

import com.example.springdemo.entity.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class SampleController(private val sampleService: SampleService) {
    @GetMapping("meet")
    fun meet(
        @RequestParam firstName: String,
        @RequestParam lastName: String,
        @RequestParam age: Int,
    ): String {
        return sampleService.meet(firstName, lastName, age)
    }

    @GetMapping("person")
    fun personBy(
        @RequestParam firstName: String,
        @RequestParam lastName: String,
        @RequestParam age: Int,
    ): Person {
        return sampleService.personBy(firstName, lastName, age)
    }


}