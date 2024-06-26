package com.example.api

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class HelloController(
    private val userRepository: UserRepository
) {
    @GetMapping("/hello")
    fun getHello(
        @RequestParam lastName: String
    ): String {
        val user = userRepository.findByLastName(lastName) ?: return "User not found..."

        return "Hello ${user.firstName}"
    }

    @GetMapping("/users")
    fun getUsers(): List<UserRecord> {
        return userRepository.findAll()
    }

    @PostMapping("user")
    @ResponseStatus(HttpStatus.CREATED)
    fun saveUser(
        @RequestParam firstName: String,
        @RequestParam lastName: String
    ): UserRecord {
        val user = UserRecord(firstName = firstName, lastName = lastName)
        return userRepository.save(user)
    }
}