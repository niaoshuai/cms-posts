package ren.shuaipeng.cms.posts

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
    fun findAllUser() {
        this.webClient!!.get().uri("/findAll").exchange().expectStatus().isOk
    }
}