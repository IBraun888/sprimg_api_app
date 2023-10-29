package sptring_api.sprimg_api_app.comroller


import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get



@SpringBootTest
@AutoConfigureMockMvc
class TestBankController {


    lateinit var mockMvc: MockMvc


    @Test
    public fun `should return all banks`() {
        mockMvc.get("/api/banks")
            .andDo {
                print()
            }
            .andExpect {
                status {
                    isOk()
                }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$[0].accountNumber") { value("1212") }
            }
    }

}
