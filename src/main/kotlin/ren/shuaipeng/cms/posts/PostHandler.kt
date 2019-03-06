package ren.shuaipeng.cms.posts

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import org.springframework.web.reactive.function.server.json


@Component
class PostHandler (
        private val postsRepository: PostRepository){

    /**
     * 查询全部
     */
    fun findAll(request: ServerRequest) =
            ok().json().body(postsRepository.findAll())

    /**
     * 查询单个
     */
    fun findTitle(request: ServerRequest) =
            ok().json().body(postsRepository.findByTitle(request.pathVariable("title")))

}
