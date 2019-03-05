package ren.shuaipeng.cms.posts


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.testng.Assert.assertTrue
import org.testng.annotations.Test
import java.util.*

@SpringBootTest
class IPostsMapperTest : AbstractTestNGSpringContextTests() {

    @Autowired
    private val postsMapper: IPostsMapper? = null

    @Test
    fun testSave() {
        var posts = Posts()
        posts.id = UUID.randomUUID().toString().replace("-", "")
        assertTrue(postsMapper!!.save(posts) > 0)
    }

    @Test
    fun testFindList() {
        assertTrue(postsMapper!!.findList().isNotEmpty())
    }

    @Test
    fun testUpdate(){

    }

    @Test
    fun testDelete(){

    }
}