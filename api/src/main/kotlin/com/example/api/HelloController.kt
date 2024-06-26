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
        return "Hello $lastName"
    }
}