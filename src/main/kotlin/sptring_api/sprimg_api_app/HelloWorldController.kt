package sptring_api.sprimg_api_app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/hello")
class HelloWorldController {
    @GetMapping
    fun helloWorld(): String = "Hello World Api my PRO"
}