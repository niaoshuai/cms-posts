package ren.shuaipeng.cms.posts

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.web.reactive.function.BodyInserters
import org.testng.annotations.Test
import java.util.*

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostsHandlerTest : AbstractTestNGSpringContextTests() {

    @Autowired
    private val webClient: WebTestClient? = null

    @Test
    fun findList() {
        this.webClient!!.get().uri("/posts/list").exchange().expectStatus().isOk
    }

    @Test
    fun save() {
        var posts = Posts()
        posts.id = "1234"
        posts.title = "89"
        posts.gmtCreate = Date()
        this.webClient!!.put()
                .uri("/posts")
                .body(BodyInserters.fromObject(posts))
                .exchange()
                .expectBody().json("{}")
    }
}