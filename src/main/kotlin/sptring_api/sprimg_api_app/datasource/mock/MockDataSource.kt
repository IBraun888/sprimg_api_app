package sptring_api.sprimg_api_app.datasource.mock

import org.springframework.stereotype.Repository
import sptring_api.sprimg_api_app.datasource.BankDataSource
import sptring_api.sprimg_api_app.model.Bank
import java.lang.IllegalArgumentException

@Repository
class MockDataSource : BankDataSource {

    val banks = mutableListOf(
        Bank(
            "Nikolay",
            "Most",
            123456,
            "Ukraine",
            "Odesa",
            "1",
            12.2,
            23,
            "https://unsplash.com/photos/closeup-photography-of-woman-smiling-mEZ3PoFGs_k"
        ),
        Bank(
            "Oleg",
            "Scat",
            12345,
            "Ukraine",
            "kiev",
            "2",
            122.2,
            21,
            "https://unsplash.com/photos/woman-wearing-black-crew-neck-shirt-3TLl_97HNJo"
        ),
        Bank(
            "Valik",
            "Rom",
            12367,
            "Ukraine",
            "Odesa",
            "3",
            125.2,
            19,
            "https://unsplash.com/photos/smiling-woman-wearing-gray-hoodie-dnL6ZIpht2s"
        ),
        Bank(
            "Vasay",
            "Clost",
            123450067,
            "Ukraine",
            "Livev",
            "4",
            1266.2,
            20,
            "https://unsplash.com/photos/woman-in-white-crew-neck-shirt-smiling-IF9TK5Uy-KI"
        ),
        Bank(
            "Kok",
            "Wans",
            123467567,
            "Ukraine",
            "Odesa",
            "5",
            12445.2,
            22,
            "https://unsplash.com/photos/man-wearing-henley-top-portrait-7YVZYZeITc8"
        ),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBanks(accountNumber: String): Bank = banks.firstOrNull() { it.accountNumber == accountNumber }
        ?: throw NoSuchElementException("UPPSSSSS")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank not faund ${bank.accountNumber}")
        }
        banks.add(bank)
        return bank
    }
}
