package sptring_api.sprimg_api_app.model

data class Bank(
    val userName: String,
    val userLastName: String,
    val id: Int,
    val country: String,
    val city: String,
    val accountNumber: String,
    val trust: Double,
    val transaction: Int,
    val avatar: String
)


