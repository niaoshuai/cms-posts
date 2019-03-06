package ren.shuaipeng.cms.post

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.body
import org.springframework.web.reactive.function.BodyInserters
import org.testng.annotations.Test
import java.time.LocalDate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostsHandlerTest : AbstractTestNGSpringContextTests() {

    @Autowired
    private val webClient: WebTestClient? = null


    @Test
    fun findList() {
        this.webClient!!.get().uri("/post").exchange().expectStatus().isOk.expectBody().json("[{}]")
    }

    /**
     * 已存在自动覆盖
     */
    @Test
    fun save() {
        var post = Post("13","124", LocalDate.now(), LocalDate.now())
        this.webClient!!.post().uri("/post").body(BodyInserters.fromObject(post))
                .exchange().expectStatus().isOk
    }

    @Test
    fun deleteAll(){
        this.webClient!!.delete().uri("/post/12")
                .exchange().expectStatus().isOk
    }
}