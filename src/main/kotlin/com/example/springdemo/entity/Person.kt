package com.example.springdemo.entity

import javax.persistence.*

@Entity
@Table(name = "person")
data class Person(
    @Id
    val id: Int = 0,

    val firstName: String = "",
    val lastName: String = "",
    val age: Int = 0,
)
