package sptring_api.sprimg_api_app.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify

import org.junit.jupiter.api.Test

import sptring_api.sprimg_api_app.datasource.BankDataSource

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call data source to retrieve banks`() {

        every { dataSource.retrieveBanks() } returns emptyList()
         bankService.getBanks()

        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}