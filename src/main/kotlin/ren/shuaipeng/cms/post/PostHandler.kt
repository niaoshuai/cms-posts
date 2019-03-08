package ren.shuaipeng.cms.post

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.notFound
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import org.springframework.web.reactive.function.server.json


@Component
class PostHandler(
        private val postRepository: PostRepository) {

    /**
     * 查询全部
     */
    fun findAll(request: ServerRequest) =
            ok().json().body(postRepository.findAll())

    /**
     * 新增
     */
    fun save(request: ServerRequest) = request.bodyToMono(Post::class.java).flatMap {
        postRepository.save(it).then(ok().build())
    }

    /**
     * 删除
     */
    fun delete(request: ServerRequest) =
            postRepository.findById(request.pathVariable("id")).flatMap {
                postRepository.deleteById(it.id)
                ok().build()
            }.switchIfEmpty(
                    notFound().build()
            )

    /**
     * 详情
     */
    fun detail(request: ServerRequest) = postRepository.findById(request.pathVariable("id")).flatMap {
        ok().json().body(BodyInserters.fromObject(it))
    }.switchIfEmpty(
            notFound().build()
    )
}
