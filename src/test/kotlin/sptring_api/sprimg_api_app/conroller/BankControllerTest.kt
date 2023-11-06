package sptring_api.sprimg_api_app.conroller


import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.*


@SpringBootTest
@AutoConfigureMockMvc
internal class BankControllerTest{
    @Autowired
    lateinit var mac: MockMvc

    @Test
    fun `should return all banks`() {
        // when/then
        mac.get("/api")
            .andDo { print() }
            .andExpect {
                status { isOk() }
                jsonPath("$[0].account_number") { value("1234") }
            }
    }
}