package com.example.hexagonalarchitecture.infrastructure.configuration

import com.example.hexagonalarchitecture.application.service.SignUpCustomerService
import com.example.hexagonalarchitecture.domain.model.CustomerRepository
import com.example.hexagonalarchitecture.infrastructure.adapters.outbound.postgres.PostgresCustomerRepository
import java.time.Clock
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate

@Configuration
class ApplicationConfiguration {

    @Bean
    fun customerRepository(jdbcTemplate: JdbcTemplate) = PostgresCustomerRepository(jdbcTemplate, Clock.systemUTC())

    @Bean
    fun signUpCustomerService(repository: CustomerRepository) = SignUpCustomerService(repository)
}
