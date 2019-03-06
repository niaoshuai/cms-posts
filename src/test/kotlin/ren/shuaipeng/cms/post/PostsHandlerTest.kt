package ren.shuaipeng.cms.post

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.springframework.test.web.reactive.server.WebTestClient
import org.testng.annotations.Test

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostsHandlerTest : AbstractTestNGSpringContextTests() {

    @Autowired
    private val webClient: WebTestClient? = null


    @Test
    fun findList() {
        this.webClient!!.get().uri("/post").exchange().expectStatus().isOk
    }
}