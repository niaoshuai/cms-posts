package ren.shuaipeng.cms.posts


import org.testng.Assert.assertNotNull
import org.testng.annotations.Test
import java.util.*

class PostsTest  {

    @Test
    fun init() {
        var posts = Posts()
        posts.id = "12"
        posts.title = "12"
        posts.gmtCreate = Date()
        posts.gmtModified = Date()

        assertNotNull(posts)
    }
}