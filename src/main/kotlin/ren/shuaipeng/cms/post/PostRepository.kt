package ren.shuaipeng.cms.post

import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.count
import org.springframework.data.mongodb.core.findAll
import org.springframework.stereotype.Repository

@Repository
class PostRepository(private val template: ReactiveMongoTemplate) {

    /**
     * 查询数量
     */
    fun count() = template.count<Post>()

    /**
     * 查询数量
     */
    fun findAll() = template.findAll<Post>()

    /**
     * 添加
     */
    fun save(post: Post) = template.save(post)

    /**
     * 根据某个条件删除
     */

    /**
     * 删除所有
     */
    fun delete(id: String) = template.remove(Post(id,null,null,null))
}
