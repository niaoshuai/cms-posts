package ren.shuaipeng.cms.posts

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserter
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyToMono
import org.springframework.web.reactive.function.server.json
import reactor.core.publisher.Mono

@Component
class PostsHandler {

    @Autowired
    private val postsMapper: IPostsMapper? = null

    fun findAllUser(request:ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().json().body(BodyInserters.fromObject(postsMapper!!.findAll()))
    }
}
