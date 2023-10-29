package sptring_api.sprimg_api_app.service

import org.springframework.stereotype.Service
import sptring_api.sprimg_api_app.datasource.BankDataSource
import sptring_api.sprimg_api_app.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBanks(accountNumber: String): Bank  = dataSource.retrieveBanks(accountNumber)

    }

