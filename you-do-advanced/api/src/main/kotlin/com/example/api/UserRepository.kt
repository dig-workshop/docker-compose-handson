package com.example.api

import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
@Transactional
interface UserRepository: JpaRepository<UserRecord, Long> {
    fun findByLastName(lastName: String): UserRecord?
}