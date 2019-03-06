package ren.shuaipeng.cms.posts

import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.count
import org.springframework.data.mongodb.core.find
import org.springframework.data.mongodb.core.findAll
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.isEqualTo
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

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
     * 通过标题查询
     */
    fun findByTitle(title:String):Flux<Post> = template.find(Query(Criteria.where("title").isEqualTo(title)))

    /**
     * 添加
     */
    fun save(post: Post) = template.save(post)

    /**
     * 根据某个条件删除
     */
    fun delete(title: String) = template.remove(Query(Criteria.where("title").isEqualTo(title)))

    /**
     * 删除所有
     */
    fun deleteAll() = template.remove(Query())
}
