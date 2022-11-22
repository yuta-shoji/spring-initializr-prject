package com.example.springdemo.personImport

import com.example.springdemo.entity.Person
import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person")
class PersonImporterController(private val importPersonService: ImportPersonService) {
    @PostMapping("/import")
    @ResponseStatus(value = CREATED)
    fun postImportPersons(@RequestBody persons: List<Person>) {
        return importPersonService.importPersonFromJSON(persons)
    }
}