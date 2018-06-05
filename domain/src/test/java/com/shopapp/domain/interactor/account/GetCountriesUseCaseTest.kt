package com.shopapp.domain.interactor.account

import com.nhaarman.mockito_kotlin.verify
import com.shopapp.domain.repository.CustomerRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetCountriesUseCaseTest {

    private lateinit var useCase: GetCountriesUseCase

    @Mock
    private lateinit var repository: CustomerRepository

    @Before
    fun setUpTest() {
        useCase = GetCountriesUseCase(repository)
    }

    @Test
    fun shouldDelegateCallToRepository() {
        useCase.buildUseCaseSingle(Unit)
        verify(repository).getCountries()
    }
}