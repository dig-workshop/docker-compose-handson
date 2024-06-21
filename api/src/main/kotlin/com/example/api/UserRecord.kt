package com.example.api

import jakarta.persistence.*

@Entity
@Table(name = "app_user")
data class UserRecord(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val firstName: String,
    val lastName: String,
)