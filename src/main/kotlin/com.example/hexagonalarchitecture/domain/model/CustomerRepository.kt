package com.example.hexagonalarchitecture.domain.model

interface CustomerRepository {
    fun save(customer: Customer): Unit
}
