package com.example.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

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