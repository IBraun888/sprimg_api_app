package sptring_api.sprimg_api_app.datasource.mock

import org.springframework.stereotype.Repository
import sptring_api.sprimg_api_app.datasource.BankDataSource
import sptring_api.sprimg_api_app.model.Bank
@Repository
class MockDataSource: BankDataSource {

    val banks =  listOf(
        Bank("1212", 3.0, 1),
        Bank("1212", 5.0, 2),
        Bank("1212", 4.0, 3)
    )
    override fun retrieveBanks(): Collection<Bank> = banks

}