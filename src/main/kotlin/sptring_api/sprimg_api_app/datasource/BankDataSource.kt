package sptring_api.sprimg_api_app.datasource

import sptring_api.sprimg_api_app.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBanks(accountNumber: String): Bank

}