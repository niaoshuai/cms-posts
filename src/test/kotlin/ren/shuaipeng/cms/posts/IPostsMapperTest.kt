package ren.shuaipeng.cms.posts


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.testng.Assert.assertTrue
import org.testng.annotations.Test
import java.util.*

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IPostsMapperTest : AbstractTestNGSpringContextTests() {

    @Autowired
    private val postsMapper: IPostsMapper? = null

    @Test
    fun testSave() {
        var posts = Posts()
        posts.id = "1"
        posts.title = "123"
        posts.gmtCreate = Date()
        assertTrue(postsMapper!!.save(posts) > 0)
    }

    @Test
    fun testFindList() {
        assertTrue(postsMapper!!.findList().isNotEmpty())
    }

    @Test
    fun testUpdate(){
        var posts = Posts()
        posts.id = "1"
        posts.title = "456"
        posts.gmtModified = Date()
        assertTrue(postsMapper!!.update(posts) > 0)
    }

    @Test
    fun testDelete(){
        assertTrue(postsMapper!!.delete("1") > 0)
    }
}