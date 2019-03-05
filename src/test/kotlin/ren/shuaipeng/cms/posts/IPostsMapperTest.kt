package ren.shuaipeng.cms.posts

import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@RunWith(SpringRunner::class)
@SpringBootTest
class IPostsMapperTest {

    @Autowired
    private val postsMapper: IPostsMapper? = null

    @Test
    fun testSave() {
        var posts = Posts()
        posts.id = UUID.randomUUID().toString().replace("-", "")
        assertTrue(postsMapper!!.save(posts) > 0)
    }

    @Test
    fun testFindAll() {
        assertTrue(postsMapper!!.findAll().isNotEmpty())
    }
}