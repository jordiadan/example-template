package com.example.hexagonalarchitecture.infrastructure.adapters.outbound.memory

import com.example.hexagonalarchitecture.domain.model.Customer
import com.example.hexagonalarchitecture.domain.model.CustomerRepository

class InMemoryCustomerRepository : CustomerRepository {

    private val customers = mutableListOf<Customer>()

    override fun save(customer: Customer) {
        customers.add(customer)
    }
}
