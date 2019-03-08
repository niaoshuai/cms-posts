package ren.shuaipeng.cms.post


import org.testng.Assert.assertNotNull
import org.testng.annotations.Test

class PostTest {

    @Test
    fun `Create Posts`() {
        var post = Post("12", "12")
        assertNotNull(post)
    }
}