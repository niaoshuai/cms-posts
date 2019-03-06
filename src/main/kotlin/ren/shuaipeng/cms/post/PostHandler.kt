package ren.shuaipeng.cms.post

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import org.springframework.web.reactive.function.server.json


@Component
class PostHandler (
        private val postRepository: PostRepository){

    /**
     * 查询全部
     */
    fun findAll(request: ServerRequest) =
            ok().json().body(postRepository.findAll())

    /**
     * 查询单个
     */
//    fun findTitle(request: ServerRequest) =
//            ok().json().body(postsRepository.findByTitle(request.pathVariable("title")))

    /**
     * 新增
     */
    fun save(request: ServerRequest) = request.bodyToMono(Post::class.java).flatMap {
        postRepository.save(it).then(ok().build())
    }

    fun deleteAll(request: ServerRequest) = postRepository.delete(request.pathVariable("id")).then(ok().build())


}
