package ren.shuaipeng.cms.post

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.web.reactive.function.BodyInserters
import org.testng.annotations.Test

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostsHandlerTest : AbstractTestNGSpringContextTests() {

    @Autowired
    private val webClient: WebTestClient? = null


    @Test
    fun `find post list data`() {
        this.webClient!!.get().uri("/post").exchange().expectStatus().isOk
    }

    /**
     * 已存在自动覆盖
     */
    @Test
    fun `save post`() {
        var post = Post("14", "124")
        this.webClient!!.post().uri("/post").body(BodyInserters.fromObject(post))
                .exchange().expectStatus().isOk
    }

    @Test
    fun `delete post`() {
        this.webClient!!.delete().uri("/post/12")
                .exchange().expectStatus().isOk
    }
}