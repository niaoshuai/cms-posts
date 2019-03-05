package ren.shuaipeng.cms.posts

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

@Service
@Transactional
class PostsService {

    @Autowired
    private val postsMapper: IPostsMapper? = null

    fun save(postsMono: Mono<Posts>): Mono<Posts> {
        return postsMono.filter {
            postsMapper!!.save(it) > 0
        }.onErrorResume {
            it.toMono()
        }
    }
}
