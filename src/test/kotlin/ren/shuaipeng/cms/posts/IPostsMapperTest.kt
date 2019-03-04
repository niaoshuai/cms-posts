package ren.shuaipeng.cms.posts

import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*
import javax.annotation.Resource

@RunWith(SpringRunner::class)
@SpringBootTest
class IPostsMapperTest {

    //    @Autowired
    @Resource
    private val postsMapper: IPostsMapper? = null

    @Test
    fun testSave() {
        var posts = Posts()
        posts.id = UUID.randomUUID().toString().replace("-", "")
        assertTrue(postsMapper!!.save(posts) > 0)
    }

    @Test
    fun testFindAll() {
        assertNotNull(postsMapper!!.findAll())
        assertTrue(postsMapper!!.findAll().size > 0)
    }
}