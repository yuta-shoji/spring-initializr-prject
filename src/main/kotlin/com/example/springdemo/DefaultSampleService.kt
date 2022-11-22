package com.example.springdemo

import com.example.springdemo.entity.Person
import org.springframework.stereotype.Service

interface SampleService {
    fun meet(firstName: String, lastName: String, age: Int): String
    fun personBy(firstName: String, lastName: String, age: Int): Person
}

@Service
class DefaultSampleService: SampleService {
    override fun meet(firstName: String, lastName: String, age: Int):String {
        return "Hi! I'm ${firstName} ${lastName}. ${age} years old. Nice to meet you!!!"
    }

    override fun personBy(firstName: String, lastName: String, age: Int): Person {
        return Person(firstName, lastName, age)
    }
}
