package ren.shuaipeng.cms.posts

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono


@Component
class PostsHandler {

    @Autowired
    private val postsService: PostsService? = null

    /**
     * 查询全部
     */
    fun findList(request: ServerRequest): Mono<ServerResponse> {
//        return ServerResponse.ok()
//                .json()
//                .body(BodyInserters.fromObject(postsMapper!!.findList()))
        return ServerResponse.ok().build()
    }

    /**
     * 添加
     */
    fun save(request: ServerRequest): Mono<ServerResponse> {
//        return request.bodyToMono(Posts::class.java)
//                .map {
//                  postsMapper!!.save(it)
//                }
//                .flatMap {
//                    posts -> ServerResponse.ok()
//                        .json()
//                        .body(fromObject(posts))
//                }

        return postsService!!.save(request.bodyToMono(Posts::class.java)).flatMap {
            ServerResponse.ok().build()
        }

    }

    /**
     * 修改
     */
    fun update(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().build()
    }

    /**
     * 删除
     */
    fun delete(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().build()
    }
}
