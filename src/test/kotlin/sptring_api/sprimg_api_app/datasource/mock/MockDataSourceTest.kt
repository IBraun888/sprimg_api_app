package sptring_api.sprimg_api_app.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockDataSourceTest{
    private val mockDataSource = MockDataSource()

    @Test
    fun `should provide a collection of banks`(){

        val bank = mockDataSource.retrieveBanks()

        assertThat(bank.size).isGreaterThanOrEqualTo(3)

    }

    @Test
    fun `should provide some mock data`(){
        val bank = mockDataSource.retrieveBanks()
        assertThat(bank).allSatisfy(){it.accountNumber.isNotBlank()}
    }
}